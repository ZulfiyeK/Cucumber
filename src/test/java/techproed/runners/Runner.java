package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class'ı testNG deki .xml file kullanımındaki gibi istediğimiz scenario lari kullanacağımız tag parametresi
sayesinde çalıştırabiliriz. Ve plugin parametresi ile raporlar alabiliriz
 */
@RunWith(Cucumber.class)//-->Test çalıştırıcı Notasyon
@CucumberOptions(plugin = {"pretty",
                           "html:target/default-cucumber-reports.html",
                           "json:target/json-reports/cucumber.json",
                           "junit:target/xml-report/cucumber.xml",
                           "rerun: TestOutput/failed_scenario.txt"},

                    //return ile belirttigimiz dosya da fail olan scenariolari
                 features = "src/test/resources/features",
                 glue = {"techproed/stepDefinition"},
                 tags = "@arc",
                 dryRun = false,  //-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = false )//--> sonuc yazilarinin renk ayarin yapar


public class Runner {
}
/*
@CucumberOptions() notasyonuna parametre olarak
            features--> packege'ın yolunu
            glue-->stepdefinition package
            tag-->çalıştırmak istediğimiz scenariolari burda belirtiriz
            Scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı seçanekleri bu notasyonda
belirtiriz

plugin = {"pretty"}--> bize detayli aciklama getirir.
monochrome = true //--> sonuc yazilarinin siyah olmasini saglar, false olursa renkli olur.
 */