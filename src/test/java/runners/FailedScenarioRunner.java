package runners;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
//        The purpose of this class is:
//        RERUN ONLY TXT FILE THAT HAS FAILED SCENARIOS

        plugin = {
                "pretty",
                "html:target/default_cucumber_report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        },
        features = "@target/failedRerun.txt",//path od features folder
        glue = {"stepdefinitions","hooks"},//path of the step definitions folder
        dryRun = false
)

public class FailedScenarioRunner {
}

/*
1. How do you run only failed scenarios?
        I have rerun plugin in the runner that generates the lines for
        only failed scenarios
2. If all your tests passed, do you see the any scenario on the .txt file?
        No, b/c rerun text file stores only failed scenario lines
3. What happens when you try to rerun the failedRunner if there is
   no failed scenarios last time?
        No tests will run cause the text file is empty
 */