package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.lang.module.Configuration;

public class US002_RegistrationNegativeSceneriosStepDef {
    LoginPage loginPage= new LoginPage();
    RegistrationPage registrationPage= new RegistrationPage();
    Faker faker=new Faker();

    @Given("user enters a short SSN {string} number")
    public void user_enters_a_short_ssn_number(String SSN)  {
        registrationPage.ssn.sendKeys(faker.number().digits(8), Keys.ENTER);
        ReusableMethods.waitFor(2);
    }
    @Given("verify the short SSN message")
    public void verify_the_short_ssn_message() {
        Assert.assertEquals(registrationPage.ssn.getText(),"Ssn is invalid.");

    }
    @Given("user enters long SSN {string} number")
    public void user_enters_long_ssn_number(String SSN) {
        registrationPage.ssn.sendKeys(ConfigReader.getProperty("invalidSsnNumber"), Keys.ENTER);

    }
    @Given("click the registration button")
    public void click_the_registration_button() {
      registrationPage.registerButton2.click();
    }
    @Given("user enter char character {string}")
    public void user_enter_char_character(String phonenumber) {
        registrationPage.ssn.sendKeys(ConfigReader.getProperty("invalidPhoneNumber"), Keys.ENTER);
    }
    @Given("user left blank {string}")
    public void user_left_blank(String username) {
       registrationPage.userNameTab.sendKeys(ConfigReader.getProperty("BlankUserName"),Keys.ENTER);
    }
    @Given("user enter email without @ sign {string}")
    public void user_enter_email_without_sign(String email) {
        registrationPage.email.sendKeys(ConfigReader.getProperty("invalidEmail"),Keys.ENTER);
        Assert.assertTrue(registrationPage.invalidEmailText.getText().contains("Your email is invalid."));

    }
    @Given("user enter email without . extensions {string}")
    public void user_enter_email_without_extensions(String string) {
        registrationPage.email.sendKeys(ConfigReader.getProperty("withoutDotEmail"),Keys.ENTER);
            Assert.assertTrue(registrationPage.emailTextIncorrectMessage.getText().contains("Your email is invalid."));

    }


}