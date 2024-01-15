package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Regression_TCs", features = "src/test/resources/Features",
        glue = "Steps",
        plugin = {})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
}