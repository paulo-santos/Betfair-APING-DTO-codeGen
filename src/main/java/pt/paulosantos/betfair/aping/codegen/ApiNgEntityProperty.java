package pt.paulosantos.betfair.aping.codegen;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paulo. 05-04-2014.
 */
public class ApiNgEntityProperty {
    private static Map<String, String> typeMappings = new HashMap<String, String>();

    static {
        typeMappings.put("MarketType","String");
        typeMappings.put("Venue","String");
        typeMappings.put("MarketId","String");
        typeMappings.put("SelectionId","Long");
        typeMappings.put("Handicap","Double");
        typeMappings.put("EventId","String");
        typeMappings.put("EventTypeId","String");
        typeMappings.put("CountryCode","String");
        typeMappings.put("ExchangeId","String");
        typeMappings.put("CompetitionId","String");
        typeMappings.put("Price","Double");
        typeMappings.put("Size","Double");
        typeMappings.put("BetId","String");
        typeMappings.put("MatchId","String");
        typeMappings.put("int","Integer");
    }

    private String fieldName;
    private String fieldType;
    private boolean isRequired;
    private String description;
    private boolean isEnum;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        if (typeMappings.get(fieldType) != null) {
            this.fieldType = typeMappings.get(fieldType);
        } else {
            this.fieldType = fieldType.replace(" ","");
        }
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnum() {
        return isEnum;
    }

    public void setEnum(boolean isEnum) {
        this.isEnum = isEnum;
    }
}
