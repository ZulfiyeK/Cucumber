package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GoogleStepDefinition {
    GooglePage googlePage = new GooglePage();


    @Given("Kullanici {string} sayfasina gitti.")
    public void kullaniciSayfasinaGitti(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Kullanici google arama kutusunda {string} aratir.")
    public void kullaniciGoogleAramaKutusundaAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(arac, Keys.ENTER);
        
    }

    @And("Google sayfa basliginin {string} icerdigini test eder.")
    public void googleSayfaBasligininIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }



    @Then("Kullanici google arama kutusunda {string} aratti.")
    public void kullaniciGoogleAramaKutusundaAratti(String araclar) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(araclar),Keys.ENTER);

    }

    @And("Google sayfa basliginin {string} icerdigini test ettir.")
    public void googleSayfaBasligininIcerdiginiTestEttir(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(str)));

    }

    @But("Kullanici {int} saniye bekler.")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
