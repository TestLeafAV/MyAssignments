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
	LoginPage obj=new LoginPage(driver);
	obj.VerifyLoginPage().enterUserName().enterPassword().clickLogin().ClickOnCrmsfa();
	HomePage hp=new HomePage(driver);
	hp.VerifyHomePage().ClickCreateAccount();
	CreateAccount ca=new CreateAccount(driver);
	ca.enterAccName().enterdesc().enterEmp().enterSite().clickCreateAccButton().verifyEndPage();
}
}
