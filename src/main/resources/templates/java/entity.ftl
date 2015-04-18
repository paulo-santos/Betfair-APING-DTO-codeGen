<#-- @ftlvariable name="entity" type="pt.paulosantos.betfair.aping.codegen.ApiNgEntity" -->
package ${entity.entitiesPackage};

<#list entity.packagesToImport as package>
import ${package};
</#list>

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public class ${entity.entityName} {
    <#list entity.properties as property>
    <#if property.description?? && property.description?length &gt; 1 >
    /**<#if property.required>
    * REQUIRED</#if>
    * ${property.description}
    */
    </#if>
    private ${property.fieldType?cap_first} ${property.fieldName};
    </#list>


    //#######################
    //# GETTERS AND SETTERS #
    //#######################
    <#list entity.properties as property>
    <#assign description> <#if property.description?? && property.description?length &gt; 1 >/**<#if property.required>
    * REQUIRED</#if>
    * ${property.description}
    */</#if></#assign>
    ${description}
    public ${property.fieldType?cap_first} get${property.fieldName?cap_first}(){
        return ${property.fieldName};
    }
    ${description}
    public void set${property.fieldName?cap_first}(${property.fieldType?cap_first} ${property.fieldName}){
        this.${property.fieldName} = ${property.fieldName};
    }
    <#if property_has_next> </#if>
    </#list>
}
