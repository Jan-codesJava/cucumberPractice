package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/resources/features/Uber.feature"},
        glue = {"step_definitions"},
        tags = "@All",
        plugin = {"pretty",
        "json:target/MyReports/report.json",
        "junit:target/MyReports/report.xml"},
       // publish = true
        monochrome = true, //proper formatting for report
        dryRun = true // will check which step is true
        //strict = true  //if the step is missing & u want to ignore // not used
)

public class UberTest {

}


