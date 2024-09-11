package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC01_LoginToApp extends ProjectSpecificMethod{
	@Test
	public void login()
	{
		LoginPage obj=new LoginPage(driver);
		obj.VerifyLoginPage().enterUserName().enterPassword().clickLogin().ClickOnCrmsfa();
	}

}
