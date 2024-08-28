package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/LoginSalesforce.feature",glue="stepDef",monochrome=true,publish=true)
public class SalesforceLogin extends AbstractTestNGCucumberTests{

}
