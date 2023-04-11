package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources",glue="org.step",dryRun=false)
public class TestRuner extends AbstractTestNGCucumberTests {

	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		
		return super.scenarios();
	}
	
	
}




