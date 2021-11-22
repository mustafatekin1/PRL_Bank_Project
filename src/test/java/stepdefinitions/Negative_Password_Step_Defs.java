package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class Negative_Password_Step_Defs {
    LoginPage loginpage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();


    @Given("user enters negative Without Capital Char password {string}")
    public void user_enters_negative_without_capital_char_password(String string) {
      registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutCapitalChar"));
      registrationPage.firstPassword.click();
    }
    @Then("user verifies invalid password message")
    public void user_verifies_invalid_password_message() {
        Assert.assertTrue(registrationPage.passwordShouldContain.getText().contains("Your password should contain at least"));
    }
    @Then("user enters negative Without Small Char password {string}")
    public void user_enters_negative_without_small_char_password(String string) {
        registrationPage.firstPassword.clear();
        ReusableMethods.waitFor(2);
    registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutSmallChar"));
    }
    @Then("user enters negative Without Special Char password {string}")
    public void user_enters_negative_without_special_char_password(String string) {
        registrationPage.firstPassword.clear();
        registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutSpecChar"));
    }
    @Then("user enters different from first password {string}")
    public void user_enters_different_from_first_password(String string) {
        registrationPage.secondPassword.sendKeys(ConfigReader.getProperty("invalidPasswordDifferentFromFirst"));

    }
    @Then("user verifies different from first password message")
    public void user_verifies_different_from_first_password_message() {
   Assert.assertTrue(registrationPage.passwordShouldMatchWithFirstOne.isDisplayed());
    }
    @Then("user enters negative Without Digits password {string}")
    public void user_enters_negative_without_digits_password(String string) {
       registrationPage.firstPassword.sendKeys(ConfigReader.getProperty("invalidPasswordWithoutDigits"));
    }

}
