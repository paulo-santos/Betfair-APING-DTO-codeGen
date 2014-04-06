package pt.paulosantos.betfair.aping.codegen;

/**
 * Created by Paulo. 05-04-2014.
 */
public class ApiNgEnumField {
    private String value;
    private String description;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description.trim();
    }
}
