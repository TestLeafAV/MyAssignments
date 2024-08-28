package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/EditAccount.feature",glue="stepDef",monochrome=true,publish=true)
public class EditAccountTC01 extends AbstractTestNGCucumberTests{

	
}
