package facebook.cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\Message.feature",
        glue = "facebook.stepDefinations",
        monochrome=true,
        strict=true,
        plugin={"pretty","html:target\\cucumber-reports\\cucumber-html-reports","json:target\\jsonReports\\report.json"} )
public class RunnerTest {
}
