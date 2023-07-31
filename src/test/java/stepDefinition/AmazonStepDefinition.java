package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {

    @Given("kullanici amazon sayfasina gider.")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }


    @Then("Kullanici arama kutusunda iphone aratir.")
    public void kullanici_arama_kutusunda_iphone_aratir() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

    }


    @Then("sayfayi kapatir.")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }



}