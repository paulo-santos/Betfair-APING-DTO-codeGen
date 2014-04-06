package pt.paulosantos.betfair.aping.codegen;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.Map;

/**
 * Created by Paulo. 06-04-2014.
 */
public abstract class AbstractGenerator {
    private String outputDir;

    private Configuration cfg;
    private Template template;

    public AbstractGenerator(String templateFile) throws IOException {
        //Freemarker configuration object
        cfg = new Configuration();
        cfg.setClassForTemplateLoading(this.getClass(),"/");
        template = cfg.getTemplate(templateFile);
    }

    public abstract void generate();

    protected Document retrieveJsoupDocument(String url) throws IOException {
        return Jsoup.parse(new URL(url), 10000);
    }

    protected void createOutputDir(String dir){
        File outputDir = new File(dir);
        outputDir.mkdirs();
    }

    protected void writeFile(Map<String, Object> data, String file) throws IOException, TemplateException {
        Writer fileWriter = new FileWriter(file);
        System.out.println("Writing "+file);
        template.process(data, fileWriter);
        fileWriter.close();
    }

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }
}
