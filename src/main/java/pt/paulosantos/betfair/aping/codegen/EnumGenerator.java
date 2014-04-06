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
public class EnumGenerator extends AbstractGenerator {
    private String confluenceLink;
    private String outputDir = "src/main/java/com/betfair/aping/enums/";
    private String enumsPackage = "com.betfair.aping.enums";

    public EnumGenerator() throws IOException {
        super("templates/java/enum.ftl");
    }

    public void generate() {
        createOutputDir(outputDir);

        try {
            Document document = retrieveJsoupDocument(confluenceLink);
            Elements panels = document.getElementsByClass("panel");
            for (Element panel : panels) {
                ApiNgEnum apiNgEnum = new ApiNgEnum();
                apiNgEnum.setEnumPackage(enumsPackage);
                apiNgEnum.setEnumName(panel.getElementsByClass("panelHeader").text());

                Elements rows = panel.select(".panelContent tbody tr");
                for (Element row : rows) {
                    Elements collumns = row.getElementsByTag("td");
                    if (collumns.size() == 2) {
                        ApiNgEnumField field = new ApiNgEnumField();
                        field.setValue(collumns.get(0).text());
                        field.setDescription(collumns.get(1).text());
                        apiNgEnum.addField(field);
                    }
                }

                Map<String, Object> data = new HashMap<String, Object>();
                data.put("apiNgEnum", apiNgEnum);
                writeFile(data, outputDir + "/" + apiNgEnum.getEnumName() + ".java");
            }
        } catch (IOException e) {
            e.printStackTrace();

        } catch (TemplateException e) {
            e.printStackTrace();
        }
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

    public String getEnumsPackage() {
        return enumsPackage;
    }

    public void setEnumsPackage(String enumsPackage) {
        this.enumsPackage = enumsPackage;
    }
}
