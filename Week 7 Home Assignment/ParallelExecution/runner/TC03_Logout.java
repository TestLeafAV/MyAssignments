package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class TC03_Logout extends ProjectSpecificMethod{
	@Test
public void logout()
{
		LoginPage obj=new LoginPage(driver);
		obj.VerifyLoginPage().enterUserName().enterPassword().clickLogin();
		WelcomePage wp=new WelcomePage(driver);
		wp.logout();
}
}
