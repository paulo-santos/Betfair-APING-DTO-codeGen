<#-- @ftlvariable name="apiNgEnum" type="pt.paulosantos.betfair.aping.codegen.ApiNgEnum" -->
package ${apiNgEnum.enumPackage};

import javax.annotation.Generated;

@Generated("pt.paulosantos.betfair.aping.codegen")
public enum ${apiNgEnum.enumName} {
<#list apiNgEnum.fields as field>
    <#if field.description?? && field.description?length &gt; 1 >
    /**
    *${field.description}
    */
    </#if>
    ${field.value}<#if field_has_next>,</#if>
</#list>
}
