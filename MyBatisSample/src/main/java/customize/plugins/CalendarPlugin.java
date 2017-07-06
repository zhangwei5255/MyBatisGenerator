package customize.plugins;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class CalendarPlugin extends PluginAdapter {

	public CalendarPlugin() {
		super();
	}


	@Override
	public void initialized(IntrospectedTable introspectedTable) {
	}

	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		changeDateToCalendar(topLevelClass);
		return true;
	}

	protected void changeDateToCalendar(TopLevelClass topLevelClass) {
		FullyQualifiedJavaType typeDate = new FullyQualifiedJavaType("java.util.Date");
		FullyQualifiedJavaType typeCalendar = new FullyQualifiedJavaType("java.util.Calendar");
		boolean hasCalendarClass = false;

		// Date型のfieldをCalendar型へ変更
		for (Field field : topLevelClass.getFields()) {
			if (typeDate.equals(field.getType())) {
				field.setType(typeCalendar);
				hasCalendarClass = true;
			}
		}

		// メソッドの戻り値型、引数型をCalendarへ
		for (Method method : topLevelClass.getMethods()) {
			// 戻り値
			if (typeDate.equals(method.getReturnType())) {
				method.setReturnType(typeCalendar);
				hasCalendarClass = true;
			}

			// 引数型
			List<Parameter> list = method.getParameters();
			for (int i = 0; i < list.size(); i++) {
				if (typeDate.equals(list.get(i).getType())) {
					// DateをCalendarに置換
					list.set(i, new Parameter(typeCalendar, list.get(i).getName()));
					hasCalendarClass = true;
				}
			}
		}

		// Calendar型を利用している場合はimport追加
		if (hasCalendarClass) {
			topLevelClass.addImportedType(typeCalendar);
		}

	}

	public boolean validate(List<String> warnings) {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}
}