package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\login\\Guru99login.feature"},glue = {"Definition"},tags = "@NegativeTesting",plugin = {"html:report/myreport.html"})
public class TestRunner {

}
