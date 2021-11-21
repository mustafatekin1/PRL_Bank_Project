package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
<<<<<<< HEAD
        PageFactory.initElements(Driver.getDriver(),this);

    }
=======
        PageFactory.initElements(Driver.getDriver(),this);}
>>>>>>> master


    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id="email")
    public WebElement email;
    @FindBy(id="firstPassword")
    public WebElement firstPassword;
    @FindBy(id="secondPassword")
    public WebElement secondPassword;

    @FindBy(id="login-item")
    public WebElement signInButton;
  
   @FindBy(xpath="(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;

    @FindBy(xpath= "(//input[@type='text'])[2]")
    public WebElement firstName;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement lastName;

    @FindBy(id = "#register-submit")
    public WebElement registerButton2;

    @FindBy(xpath = "//*[contains(text(), 'Registration saved')]")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressTab;

    @FindBy(id = "mobilephone")
    public WebElement phoneTab;





    }

