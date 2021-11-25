package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DefaultPage;
import pages.LoginPage;
import pages.MainPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class CustomerLoginStepDefs {

    LoginPage loginPage = new LoginPage();
    //RegistrationPage registrationPage = new RegistrationPage();
   // MainPage mainPage = new MainPage();
    DefaultPage defaultPage = new DefaultPage();
//    @Given("user opens the url")
//    public void user_opens_the_url() {
//        Driver.getDriver().get(ConfigReader.getProperty("project_url"));
//    }
   // @When("user navigates to login page")
//    public void user_navigates_to_login_page() {
//        mainPage.signInAndRegistrationTab.click();
//        mainPage.signInButton.click();

   // }
//    @When("user enters username {string}")
//    public void user_enters_username(String customer_username) {
//        loginPage.loginUserName.sendKeys(customer_username);
//    }
    @When("user enters password {string}")
    public void user_enters_password(String customer_password) {
        loginPage.loginPassword.sendKeys(customer_password);
    }
    @Then("verify that user successfully logins to the account")
    public void verify_that_user_successfully_logins_to_the_account() {
        String myOperations = defaultPage.myOperationsText.getText();
        Assert.assertTrue(myOperations.contains("My Operations"));
    }


}
