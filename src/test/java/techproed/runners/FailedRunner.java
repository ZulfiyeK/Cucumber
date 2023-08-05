package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)//-->Test çalıştırıcı Notasyon
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},

        //return ile belirttigimiz dosya da fail olan scenariolari
        features = "@TestOutput/failed_scenario.txt",
        glue = {"techproed/stepDefinition"},
        tags = "@arc",
        dryRun = false,  //-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = false )//--> sonuc yazilarinin renk ayarin yapar




public class FailedRunner {
}

/*
    FailedRunner class'ını oluşturma amacımız rerun ile belirttiğimiz yolda fail olan scenarioları
tekrar bu class'dan tüm scenario'ları tekrar çalıştırmak yerine sadece fail olanları çalıştırmak
için kullanırız. @CucumberOptions() parametresi içine belirttiğimiz features tag'ına bu class'da
fail olan scenarioları tutan txt dosyasının yolunu belirtiriz. Dosya yolu belirttiğimiz için
önüne @ işareti koymamız gerekir
 */