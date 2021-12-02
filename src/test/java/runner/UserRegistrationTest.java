package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/resources/features/registration.feature"},
        glue = {"step_definitions"},
        tags = "@All",
        plugin = {"pretty",
                "json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml"}

)
public class UserRegistrationTest {

}
