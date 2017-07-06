package customize.plugins;


import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.TopLevelClass;


public class TestPlugin extends PluginAdapter {
   private FullyQualifiedJavaType serializable = new FullyQualifiedJavaType("java.io.Serializable");
   private FullyQualifiedJavaType gwtSerializable = new FullyQualifiedJavaType("com.google.gwt.user.client.rpc.IsSerializable");
   private boolean addGWTInterface;
   private boolean suppressJavaInterface;

   public boolean validate(List<String> warnings) {
      return true;
   }


   public void setProperties(Properties properties) {
      super.setProperties(properties);
      this.addGWTInterface = Boolean.valueOf(properties.getProperty("addGWTInterface")).booleanValue();
      this.suppressJavaInterface = Boolean.valueOf(properties.getProperty("suppressJavaInterface")).booleanValue();
   }



   public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
      this.makeSerializable(topLevelClass, introspectedTable);
      return true;
   }



   public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
      this.makeSerializable(topLevelClass, introspectedTable);
      return true;
   }



   public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
      this.makeSerializable(topLevelClass, introspectedTable);
      return true;
   }


   protected void makeSerializable(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
      if(this.addGWTInterface) {
         topLevelClass.addImportedType(this.gwtSerializable);
         topLevelClass.addSuperInterface(this.gwtSerializable);
      }

      if(!this.suppressJavaInterface) {
         topLevelClass.addImportedType(this.serializable);
         topLevelClass.addSuperInterface(this.serializable);

         Field field = new Field();
         field.setFinal(true);
         field.setInitializationString("1L");
         field.setName("serialVersionUID");
         field.setStatic(true);
         field.setType(new FullyQualifiedJavaType("long"));
         field.setVisibility(JavaVisibility.PRIVATE);
         this.context.getCommentGenerator().addFieldComment(field, introspectedTable);

         topLevelClass.addField(field);
      }
   }
}

