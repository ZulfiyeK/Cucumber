package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

import java.sql.SQLOutput;
import java.util.Map;

public class BlueRentalStepDefinition {

    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Then("Kullanici login butonuna tiklar.")
    public void kullaniciLoginButonunaTiklar() {
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

    @And("Kullanici Excel'deki {string} sayfasindaki bilgiler ile giris yapildigini test eder.")
    public void kullaniciExcelDekiSayfasindakiBilgilerIleGirisYapildiginiTestEder(String sayfaIsmi) {
        String dosyaYolu = "src/test/resources/mysmoketestdata.xlsx";
        ExcelReader excelReader= new ExcelReader(dosyaYolu,sayfaIsmi);
        for (int i = 1; i <=excelReader.rowCount() ; i++) {
            String email = excelReader.getCellData(i,0);
            String password = excelReader.getCellData(i,1);
            blueRentalPage.loginButton.click();
            blueRentalPage.emailBox.sendKeys(email,Keys.TAB,password,Keys.ENTER);
            ReusableMethods.bekle(2);
            blueRentalPage.activeLogin.click();
            ReusableMethods.bekle(2);
            blueRentalPage.profileButton.click();
            ReusableMethods.bekle(2);
            Assert.assertEquals(blueRentalPage.profileMail.getText(),email);
            ReusableMethods.bekle(2);
            blueRentalPage.activeLogin.click();
            ReusableMethods.bekle(2);
            blueRentalPage.logOut.click();
            ReusableMethods.bekle(2);
            blueRentalPage.logOutOK.click();
            ReusableMethods.bekle(2);



        }

    }
}
