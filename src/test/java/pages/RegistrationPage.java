package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id="login-item")
    public WebElement signInButton;
   @FindBy(xpath="(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;






}
