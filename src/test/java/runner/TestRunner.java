package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinition", "Hooks"},
        plugin = {"pretty"}
)
public class TestRunner {
    // This class is used as an entry point for JUnit to run the Cucumber tests.
}
