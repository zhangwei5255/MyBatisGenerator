package customize.plugins;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

public class MapperToDaoPlugin extends PluginAdapter {


    public boolean validate(List<String> paramList) {
        return true;
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        super.initialized(introspectedTable);

        // Mapper -> Dao
        String name = introspectedTable.getMyBatis3JavaMapperType();
        introspectedTable.setMyBatis3JavaMapperType(name.replaceAll("Mapper$", "Dao"));
    }
}