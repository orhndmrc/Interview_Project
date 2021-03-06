package runnerTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
// This creates cucumber reports
        plugin = {"pretty", "json:target/cucumber.json",
                "html:target/cucumber-html-reports"

        },
        //This create auto method name in camelCase
        monochrome = true,
        dryRun = false,
        strict = true,
        //Path to your feature file
        features = {"src/test/java/features"},
        // Specify tags to be executed
        tags = {"@Registration"},
        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"stepDefinitions"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    //dont write any codes here
}
