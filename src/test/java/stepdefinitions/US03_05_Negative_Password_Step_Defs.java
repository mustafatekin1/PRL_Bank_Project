package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.MainPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US03_05_Negative_Password_Step_Defs {
    LoginPage loginpage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    MainPage mainPage = new MainPage();

    @Given("user enters negative password Without Capital Char {string}")
    public void user_enters_negative_password_without_capital_char(String string) {
        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutCapitalChar"),Keys.ENTER);
   Assert.assertTrue(registrationPage.passwordShouldContain.isDisplayed());
        registrationPage.firstPassword.clear();
    }

    @Then("user enters negative password Without Small Char  {string}")
    public void user_enters_negative_password_without_small_char(String string) {

        //registrationPage.firstPassword.click();
        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutSmallChar"));
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registrationPage.passwordShouldContain.isDisplayed());
    }
    @Then("user enters negative password Without Special Char  {string}")
    public void user_enters_negative_password_without_special_char(String string) {
        registrationPage.firstPassword.clear();
        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutSpecChar"));
        Assert.assertTrue(registrationPage.passwordShouldContain.isDisplayed());
    }
    @Then("user enters negative password Without Digits  {string}")
    public void user_enters_negative_password_without_digits(String string) {
        registrationPage.firstPassword.clear();
        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutDigits"));
        Assert.assertTrue(registrationPage.passwordShouldContain.isDisplayed());

    }

    @Then("user enters different from first password {string}")
    public void user_enters_different_from_first_password(String string) {
        registrationPage.firstPassword.clear();
        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("validPassword"));
        registrationPage.secondPassword.sendKeys(ConfigReader.getProperty("invalidPasswordDifferentFromFirst"));
        Assert.assertTrue(registrationPage.passwordShouldContain.isDisplayed());
        ReusableMethods.waitFor(3);
    }
    @Then("user verifies different from first password message")
    public void user_verifies_different_from_first_password_message() {
        registrationPage.secondPassword.clear();
        ReusableMethods.waitFor(2);
       registrationPage.secondPassword.sendKeys(ConfigReader.getProperty("validPassword"));
    }
    @Then("user close the application")
    public void user_close_the_application() {
        //Driver.closeDriver();
    }

}
