package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DefaultPage {

    public DefaultPage(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//span[.='BF Employee1']")
    public WebElement employeeAccountNameText;

    @FindBy(xpath = "//span[.='BF Manager1']")
    public WebElement managerAccountNameText;

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement myOperationsDropdown;

    @FindBy(xpath = "//*[contains(text(),'Manage Customers')]")
    public WebElement manageCustomers;

    @FindBy(xpath = "//*[contains(text(),'Manage Accounts')]")
    public WebElement manageAccounts;
}
