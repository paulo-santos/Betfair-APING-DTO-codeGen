package pt.paulosantos.betfair.aping.codegen;

import java.io.IOException;

/**
 * Created by Paulo. 06-04-2014.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        EnumGenerator bettingEnumGenerator = new EnumGenerator();
        bettingEnumGenerator.setConfluenceLink("https://api.developer.betfair.com/services/webapps/docs/display/1smk3cen4v3lu3yomq5qye0ni/Betting+Enums");
        bettingEnumGenerator.setEnumsPackage("com.betfair.aping.betting.enums");
        bettingEnumGenerator.setOutputDir("src/main/java/com/betfair/aping/betting/enums");
        bettingEnumGenerator.generate();

        EntityGenerator bettingEntityGenerator = new EntityGenerator();
        bettingEntityGenerator.setConfluenceLink("https://api.developer.betfair.com/services/webapps/docs/display/1smk3cen4v3lu3yomq5qye0ni/Betting+Type+Definitions");
        bettingEntityGenerator.setEntitiesPackage("com.betfair.aping.betting.entities");
        bettingEntityGenerator.setEnumsPackage("com.betfair.aping.betting.enums");
        bettingEntityGenerator.setOutputDir("src/main/java/com/betfair/aping/betting/entities");
        bettingEntityGenerator.generate();


        EnumGenerator accountEnumGenerator = new EnumGenerator();
        accountEnumGenerator.setConfluenceLink("https://api.developer.betfair.com/services/webapps/docs/display/1smk3cen4v3lu3yomq5qye0ni/Accounts+Enums");
        accountEnumGenerator.setEnumsPackage("com.betfair.aping.account.enums");
        accountEnumGenerator.setOutputDir("src/main/java/com/betfair/aping/account/enums");
        accountEnumGenerator.generate();

        EntityGenerator accountEntityGenerator = new EntityGenerator();
        accountEntityGenerator.setConfluenceLink("https://api.developer.betfair.com/services/webapps/docs/display/1smk3cen4v3lu3yomq5qye0ni/Accounts+TypeDefinitions");
        accountEntityGenerator.setEntitiesPackage("com.betfair.aping.account.entities");
        accountEntityGenerator.setEnumsPackage("com.betfair.aping.account.enums");
        accountEntityGenerator.setOutputDir("src/main/java/com/betfair/aping/account/entities");
        accountEntityGenerator.generate();
    }
}
