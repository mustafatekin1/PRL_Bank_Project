package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pages.MainPage;
import pages.UserInfoPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class US006_UserInfoStepDef {

    MainPage mainPage = new MainPage();
    UserInfoPage userInfoPage = new UserInfoPage();

    //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @Given("user clicks on the username on the top right")
    public void user_clicks_on_the_username_on_the_top_right() {
        userInfoPage.userIcon.click();
    }

    @Then("user clicks on user info link")
    public void user_clicks_on_user_info_link() throws InterruptedException {
        Thread.sleep(3000);
        userInfoPage.userInfoLink.click();

    }

    @Given("{string} must be entered as first name")
    public void must_be_entered_as_first_name(String firstName)  {
        //userInfoPage.firstNameBox.clear();
        //userInfoPage.firstNameBox.sendKeys(firstName,Keys.ENTER);
        String firsNameText = userInfoPage.firstNameBox.getAttribute("value");
        System.out.println("firsNameText = " + firsNameText);
        Assert.assertEquals(firstName,firsNameText);

    }

    @Given("{string} must be entered as last name")
    public void must_be_entered_as_last_name(String lastName) {
        //userInfoPage.lastNameBox.clear();
        //userInfoPage.lastNameBox.sendKeys(lastName,Keys.ENTER);
        String lastNameText = userInfoPage.lastNameBox.getAttribute("value");
        Assert.assertEquals(lastName,lastNameText);

    }

    @Given("{string} must be entered as email")
    public void must_be_entered_as_first_email(String email) {
        //userInfoPage.emailBox.clear();
        //userInfoPage.emailBox.sendKeys(email,Keys.ENTER);
        String emailText = userInfoPage.emailBox.getAttribute("value");
        Assert.assertEquals(email,emailText);

    }

    @And("{string} must be selected as language")
    public void mustBeSelectedAsLanguage(String language) {
        Select select = new Select(userInfoPage.selectLanguages);
        String firstLanguage = select.getFirstSelectedOption().getText();
        Assert.assertEquals(language,firstLanguage);

    }

    @Given("user select {string} language")
    public void user_select_language(String options) {

        int index = Integer.parseInt(options);

        Select select = new Select(userInfoPage.selectLanguages);
        select.selectByIndex(index);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(userInfoPage.selectLanguages.isDisplayed());

    }

    @Given("user clears first name textbox")
    public void userClearsFirstNameTextbox()  {
        userInfoPage.firstNameBox.clear();

    }

    @Given("user updates first name as {string}")
    public void user_updates_first_name_as(String firstname) {
        Driver.waitForVisibility(userInfoPage.firstNameBox,3);

        userInfoPage.firstNameBox.sendKeys(firstname);

    }

    @Given("user clears last name textbox")
    public void userClearsLastNameTextbox() {
        userInfoPage.lastNameBox.clear();

    }

    @Given("User updates last name as {string}")
    public void user_updates_last_name_as(String lastname) {
        Driver.waitForVisibility(userInfoPage.lastNameBox,3);

        userInfoPage.lastNameBox.sendKeys(lastname);

    }

    @Given("user clears email textbox")
    public void userClearsEmailTextbox() {
        userInfoPage.emailBox.clear();
    }

    @Given("user uses the {string} sign when they update their email address")
    public void user_uses_the_sign_when_they_update_their_email_address(String symbolAt) {
        userInfoPage.emailBox.sendKeys("SDETqa"+symbolAt+"gmail.com");

    }
    @And("user uses the new {string} sign when they update their email address")
    public void userUsesTheNewSignWhenTheyUpdateTheirEmailAddress(String symbolCom) {
        userInfoPage.emailBox.clear();
        userInfoPage.emailBox.sendKeys("sdet@gmail"+symbolCom);
    }

    @Given("user don't uses the @ sign when they update their email address")
    public void userDonTUsesTheSignWhenTheyUpdateTheirEmailAddress() {
        userInfoPage.emailBox.clear();
        userInfoPage.emailBox.sendKeys("qasdet"+"gmail.com");
        Assert.assertTrue(userInfoPage.invalidMassage.isDisplayed());

    }

    @And("user don't uses the .com sign when they update their email address")
    public void userDonTUsesTheComSignWhenTheyUpdateTheirEmailAddress() {
        userInfoPage.emailBox.clear();
        userInfoPage.emailBox.sendKeys("qasdet@gmail");
        Assert.assertTrue(userInfoPage.invalidMassage.isDisplayed());

    }


}
