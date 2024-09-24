package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features="src/test/resources/features",
                  glue={"stepdefs"},
                   plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
                    //tags= "@loginFailure",
                    monochrome = true,publish = true)

public class CukesRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)

    public Object[][] scenarios(){
        return super.scenarios();
    }

}
