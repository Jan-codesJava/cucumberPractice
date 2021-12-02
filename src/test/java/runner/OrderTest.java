package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features/Order.feature"},
        glue = {"step_definitions"},
        //tags = "@All",
        plugin = {"pretty"}
)
public class OrderTest {
}
