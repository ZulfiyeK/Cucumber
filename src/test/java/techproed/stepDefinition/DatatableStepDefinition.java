package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

public class DatatableStepDefinition {


    DataTablePage dataTablePage = new DataTablePage();

    @Then("Kullanici sayfadaki tablodaki new butonuna tiklar.")
    public void kullaniciSayfadakiTablodakiNewButonunaTiklar() {
        dataTablePage.newButton.click();

    }


    @And("Cikan pencerede {string},{string},{string},{string},{string},{string},{string} bilgiler girilir.")
    public void cikanPenceredeBilgilerGirilir(String firstName, String lastName, String position, String office, String extention, String date, String salary) {
        dataTablePage.firstName.sendKeys(firstName,Keys.TAB,lastName,Keys.TAB,position,Keys.TAB,office, Keys.TAB,extention, Keys.TAB,date, Keys.TAB,salary, Keys.TAB);
    }

    @And("Kullanici create butonuna basar.")
    public void kullaniciCreateButonunaBasar() {
        dataTablePage.createButton.click();
    }

    @And("Kullanici searc bolumune {string} bilgisini girer.")
    public void kullaniciSearcBolumuneBilgisiniGirer(String str) {
        dataTablePage.searchBox.sendKeys(str);

    }

    @And("Kullanici {string} ile basarili giris yapildigini dogrular.")
    public void kullaniciIleBasariliGirisYapildiginiDogrular(String verify) {
        Assert.assertTrue(dataTablePage.verify.getText().contains(verify));
    }
}
