package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {"pretty", "html:target/DSPortalReports/report.html",
				"junit:target/DSPortalReports/report.junit"},
		monochrome = false,
		features = {"src/test/resources/features"},
		glue = "stepdefinations")

public class TestRunner {
}

