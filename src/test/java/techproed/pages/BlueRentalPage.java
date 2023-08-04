package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {

    public BlueRentalPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@type='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement activeLogin;

    @FindBy(xpath = "//*[.='Profile']")
    public WebElement profileButton;

    @FindBy(xpath = "//em")
    public WebElement profileMail;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOut;
    @FindBy(xpath = "//button[@class='ajs-button ajs-ok']")
    public WebElement logOutOK;


}
