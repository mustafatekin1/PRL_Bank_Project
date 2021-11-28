package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import utilities.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@dateNegative",
        dryRun = false
)
public class Runner {

}