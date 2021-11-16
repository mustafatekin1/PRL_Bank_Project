package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //interview Q: what is hooks and how do you use it?
//Hooks has before and After annotations
// hooks will run before and after each Scenario
//interview Q: What is in your After in the hooks?
//-in cucumber hooks I use reports and I take screenshot
//-I designed my hooks. It takes screenshot when a test scenario fails.
    @Before
    public void setUp(){
        System.out.println("This is hooks before method");
    }
    @After
    public void tearDown(Scenario scenario){
//        System.out.println("This is hooks after method");
//        Getting the screenshot: getScreenshotAs method takes the screenshot
        //       final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//       Attaching the screenshot to the scenarios in the default-cucumber-reports.html
        //      if (scenario.isFailed()) {
        //          scenario.attach(screenshot, "image/png", "Screenshot");
    }
}

