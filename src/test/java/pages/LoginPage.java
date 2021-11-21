package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement registrationTab;

    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement gmiBankAssertion;




}
