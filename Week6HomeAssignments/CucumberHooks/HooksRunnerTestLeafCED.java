package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/features/TestLeafCreateAccount.feature","src/test/java/features/TestLeafEditAccount.feature","src/test/java/features/TestLeafDeleteAccount.feature"},
	glue={"stepDef","hooks"},monochrome=true,publish=true)
public class HooksRunnerTestLeafCED extends AbstractTestNGCucumberTests{

}
