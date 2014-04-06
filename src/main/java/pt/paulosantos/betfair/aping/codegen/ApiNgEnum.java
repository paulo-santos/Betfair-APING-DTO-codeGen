package pt.paulosantos.betfair.aping.codegen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paulo. 05-04-2014.
 */
public class ApiNgEnum {
    private String enumName;
    private String enumPackage = "com.betfiar.aping.enums";
    private List<ApiNgEnumField> fields = new ArrayList<ApiNgEnumField>();

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public void addField(ApiNgEnumField field){
        fields.add(field);
    }

    public List<ApiNgEnumField> getFields() {
        return fields;
    }

    public void setFields(List<ApiNgEnumField> fields) {
        this.fields = fields;
    }

    public String getEnumPackage() {
        return enumPackage;
    }

    public void setEnumPackage(String enumPackage) {
        this.enumPackage = enumPackage;
    }
}
