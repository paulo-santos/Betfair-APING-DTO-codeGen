package pt.paulosantos.betfair.aping.codegen;

import freemarker.template.TemplateException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Paulo. 06-04-2014.
 */
public class EntityGenerator extends AbstractGenerator{
    private String confluenceLink;
    private String outputDir = "src/main/java/com/betfair/aping/entities";
    private String entitiesPackage  = "com.betfair.aping.entities";
    private String enumsPackage = "com.betfair.aping.enums";

    public EntityGenerator() throws IOException {
        super("templates/java/entity.ftl");
    }

    public void generate(){
        createOutputDir(outputDir);

        try {
            Document doc = retrieveJsoupDocument(confluenceLink);
            Elements panels = doc.getElementsByClass("panel");
            for (Element panel : panels) {
                ApiNgEntity entity = new ApiNgEntity();
                entity.setEntityName(panel.getElementsByClass("panelHeader").text());
                entity.setEnumsPackage(enumsPackage);
                entity.setEntitiesPackage(entitiesPackage);

                Elements rows = panel.select(".panelContent tbody tr");
                for(Element row : rows) {
                    Elements collumns = row.getElementsByTag("td");
                    if (collumns.size() == 4) {
                        ApiNgEntityProperty property = new ApiNgEntityProperty();
                        property.setFieldName(collumns.get(0).text());
                        property.setFieldType(collumns.get(1).text());
                        property.setRequired(isRequired(collumns));
                        property.setDescription(collumns.get(3).text());
                        property.setEnum(isEnum(collumns));

                        entity.addProperty(property);
                    }
                }

                if(entity.getProperties().size() > 0) {
                    Map<String, Object> data = new HashMap<String, Object>();
                    data.put("entity", entity);
                    writeFile(data, outputDir+"/"+entity.getEntityName()+".java");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }

    }

    private boolean isRequired(Elements collumns) {
        return collumns.get(2).getElementsByTag("img").size() > 0;
    }

    private boolean isEnum(Elements collumns)
    {
        Elements links = collumns.get(1).getElementsByTag("a");
        return links.size() > 0 && links.get(0).attr("href").contains("Enums");
    }

    public String getConfluenceLink() {
        return confluenceLink;
    }

    public void setConfluenceLink(String confluenceLink) {
        this.confluenceLink = confluenceLink;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public String getEntitiesPackage() {
        return entitiesPackage;
    }

    public void setEntitiesPackage(String entitiesPackage) {
        this.entitiesPackage = entitiesPackage;
    }

    public String getEnumsPackage() {
        return enumsPackage;
    }

    public void setEnumsPackage(String enumsPackage) {
        this.enumsPackage = enumsPackage;
    }
}
