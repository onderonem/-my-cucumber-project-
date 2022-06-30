package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true, // monochrome is false by default
                           // it makes the console more readable

        plugin = {         // It creates report
                "pretty",  // it makes the console more readable
                "html:target/default_cucumber_report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        },
        
        features = "./src/test/resources/features",// Path od features folder
                                                   // Non-technical part
        glue = {"stepdefinitions"},     // Path of the step definitions folder
                                        // Technical part
        tags = "@db_customer_ssn",      // It shows which FF do we want to run
        dryRun = false
        // It used to check if there is any missing Java Code(Step Defs)
        // dryRun=true runs without opening the browser, and it gives us
        //             step defs if there is a missing codes
        // dryRun=true runs like "headless browser"
        // drRun : false ==> By default

)
public class Runner {
}
  /*
        Runner class is used to run the feature files
        @RunWith : makes this class runnable
        @CucumberOptions : for configuration
                1. features : path of the features folder
                2. glue : path of the step definitions folder
        */