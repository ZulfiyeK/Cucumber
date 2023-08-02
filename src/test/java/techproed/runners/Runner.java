package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class'ı testNG deki .xml file kullanımındaki gibi istediğimiz scenario lari kullanacağımız tag parametresi
sayesinde çalıştırabiliriz. Ve plugin parametresi ile raporlar alabiliriz
 */
@RunWith(Cucumber.class)//-->Test çalıştırıcı Notasyon
@CucumberOptions(features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@tech",
        dryRun = false //-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
)

public class Runner {
}
/*
@CucumberOptions() notasyonuna parametre olarak
            features--> packege'ın yolunu
            glue-->stepdefinition package
            tag-->çalıştırmak istediğimiz scenariolari burda belirtiriz
            Scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı seçanekleri bu notasyonda
belirtiriz
 */