package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:src/test/reports/cucumber-html-report",  "json:src/test/reports/report.json"},
        features = {"src/main/resources/features"},
        glue = {"steps"})

public class TestRunner {
}
