package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TechproPage;
import utilities.Driver;

public class TechproStepDefinition {
    @Given("Kullanici techpro sayfasina gider")
    public void kullaniciTechproSayfasinaGider() {
        Driver.getDriver().get("https://techproeducation.com");

    }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        TechproPage techproPage = new TechproPage();
        techproPage.aramaKutusu.sendKeys("qa", Keys.ENTER);
    }

    @And("Sayfa basliginin qa icerdigini test eder")
    public void sayfaBasligininQaIcerdiginiTestEder() {
        Assert.assertFalse(Driver.getDriver().getTitle().contains("qa"));

    }


}
