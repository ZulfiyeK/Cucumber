package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.sql.SQLOutput;
import java.util.Map;

public class BlueRentalStepDefinition {

    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Then("Kullani login butonuna tiklar.")
    public void kullaniLoginButonunaTiklar() {
        blueRentalPage.loginButton.click();

    }
    @And("Kullanici,verilen kullanici bilgileri ile login olur.")
    public void kullaniciVerilenKullaniciBilgileriIleLoginOlur(DataTable data) {
        //blueRentalPage.emailBox.sendKeys(data.row(1).get(Integer.parseInt(ConfigReader.getProperty(String.valueOf(0)))));
        //config.propertiesden almak sitersek verileri int deger gitrmem gerekecegi icin get icini int, config icini Stringe donusturdum.
        //ama cok uzayacagi icin basit yoldan asagida cozelim.

        blueRentalPage.emailBox.sendKeys(data.row(1).get(0), Keys.TAB,
                                         data.row(1).get(1),Keys.ENTER);
        ReusableMethods.bekle(3);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(3);
        blueRentalPage.emailBox.sendKeys(data.row(2).get(0), Keys.TAB,
                                         data.row(2).get(1),Keys.ENTER);
        ReusableMethods.bekle(3);




    }


    @And("Kullanici,verilen bilgileri ile login olur.")
    public void kullaniciVerilenBilgileriIleLoginOlur(DataTable data) {
        for (Map<String,String> w : data.asMaps()) {
            blueRentalPage.emailBox.sendKeys(w.get("Email"),Keys.TAB,
                                             w.get("Password"),Keys.ENTER);
            ReusableMethods.bekle(3);
            Driver.getDriver().navigate().back();
            ReusableMethods.bekle(3);

        }
    }
}
