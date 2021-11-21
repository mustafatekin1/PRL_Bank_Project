package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);}


















        @FindBy(id = "#register-submit")
        public WebElement registerButton;

        @FindBy(xpath = "//*[contains(text(), 'Registration saved')]")
        public WebElement successMessage;

    }

