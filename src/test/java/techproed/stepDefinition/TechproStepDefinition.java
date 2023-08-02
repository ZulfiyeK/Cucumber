package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TechproStepDefinition {
    TechproPage techproPage = new TechproPage();

    @Given("Kullanici techpro sayfasina gider")
    public void kullaniciTechproSayfasinaGider() {
        Driver.getDriver().get("https://techproeducation.com");
    }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        techproPage.aramaKutusu.sendKeys("qa", Keys.ENTER);
    }

    @And("Sayfa basliginin qa icerdigini test eder")
    public void sayfaBasligininQaIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("qa"));
    }


    @Then("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        techproPage.aramaKutusu.sendKeys("java", Keys.ENTER);
    }

    @And("Sayfa basliginin java icerdigini test eder.")
    public void sayfaBasligininJavaIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("java"));
    }

    @Then("arama kutusunda mobil aratir")
    public void aramaKutusundaMobilAratir() {
        techproPage.aramaKutusu.sendKeys("mobil");
    }

    @When("cikan dropdawn'da mobil developer linkine tiklar")
    public void cikanDropdawnDaMobilDeveloperLinkineTiklar() {
        ReusableMethods.bekle(2);
        techproPage.mobileLink.click();
        ReusableMethods.bekle(2);

    }

    @And("Sayfa basliginin mobil icerdigini test eder.")
    public void sayfaBasligininMobilIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("mobil"));
    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        techproPage.aramaKutusu.sendKeys(str);
    }
}
