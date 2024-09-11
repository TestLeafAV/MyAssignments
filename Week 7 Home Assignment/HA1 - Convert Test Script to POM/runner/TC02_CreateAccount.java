package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.CreateAccount;
import pages.HomePage;
import pages.LoginPage;

public class TC02_CreateAccount extends ProjectSpecificMethod{
@Test

public void AccCreation()
{	
	LoginPage obj=new LoginPage();
	obj.VerifyLoginPage().enterUserName().enterPassword().clickLogin().ClickOnCrmsfa();
	HomePage hp=new HomePage();
	hp.VerifyHomePage().ClickCreateAccount();
	CreateAccount ca=new CreateAccount();
	ca.enterAccName().enterdesc().enterEmp().enterSite().clickCreateAccButton().verifyEndPage();
}
}
