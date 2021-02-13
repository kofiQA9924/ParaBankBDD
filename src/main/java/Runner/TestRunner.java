package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by RUTHERFORD on 2/11/2021.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/Login.feature",tags = "@Login",glue = "stepDefinitions",
plugin = {"pretty","html:test-output"})
public class TestRunner {
}
