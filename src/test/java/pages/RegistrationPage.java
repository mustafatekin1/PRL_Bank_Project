package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id="email")
    public WebElement email;
    @FindBy(id="firstPassword")
    public WebElement firstPassword;
    @FindBy(id="secondPassword")
    public WebElement secondPassword;







}
