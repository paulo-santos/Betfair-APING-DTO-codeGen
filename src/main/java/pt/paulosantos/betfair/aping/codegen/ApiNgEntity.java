package pt.paulosantos.betfair.aping.codegen;

import java.util.*;

/**
 * Created by Paulo. 05-04-2014.
 */
public class ApiNgEntity {
    private static Map<String, String> propertyImportMapping = new HashMap<String, String>();
    private String enumsPackage     = "com.betfair.aping.enums";
    private String entitiesPackage  = "com.betfair.aping.entities";

    static {
        propertyImportMapping.put("Date", "java.util.Date");
        propertyImportMapping.put("List", "java.util.List");
        propertyImportMapping.put("Map", "java.util.Map");
        propertyImportMapping.put("Set", "java.util.Set");
    }

    private String entityName;
    private List<ApiNgEntityProperty> properties = new ArrayList<ApiNgEntityProperty>();

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName.replace(" ","");
    }

    public List<ApiNgEntityProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ApiNgEntityProperty> properties) {
        this.properties = properties;
    }

    public void addProperty(ApiNgEntityProperty property) {
        properties.add(property);
    }

    public Set<String> getPackagesToImport(){

        SortedSet<String> packages = new TreeSet<String>();
        for (ApiNgEntityProperty property : getProperties()){
            if(property.isEnum()) {
                String[] type = property.getFieldType().split("<");
                if(type.length > 1){
                    packages.add(propertyImportMapping.get(type[0]));
                    packages.add(enumsPackage+"."+type[1].replace(" ","").replace(">",""));
                }else{
                    packages.add(enumsPackage+"."+property.getFieldType().replace(" ",""));
                }
            } else {
                String type = property.getFieldType().split("<")[0];
                if(propertyImportMapping.containsKey(type)){
                    packages.add(propertyImportMapping.get(type));
                }
            }
        }
        return packages;
    }

    public String getEnumsPackage() {
        return enumsPackage;
    }

    public void setEnumsPackage(String enumsPackage) {
        this.enumsPackage = enumsPackage;
    }

    public String getEntitiesPackage() {
        return entitiesPackage;
    }

    public void setEntitiesPackage(String entitiesPackage) {
        this.entitiesPackage = entitiesPackage;
    }
}
