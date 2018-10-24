package CucumberFramework.CucumberFrameworkWithoutRunnerClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ajinkya.bhobad\\eclipse-workspace\\CucumberFrameworkWithoutRunnerClass\\src\\resources\\featureFiles\\GmailLogin.feature",
				glue= {"stepDefinations"}
		)
public class TestRunner {
}
