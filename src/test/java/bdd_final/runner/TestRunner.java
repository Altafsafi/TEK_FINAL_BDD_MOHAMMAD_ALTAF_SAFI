package bdd_final.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/MainPageValidation.feature",
        glue = "bdd_final.steps",
        dryRun = false
)

public class TestRunner {
}
