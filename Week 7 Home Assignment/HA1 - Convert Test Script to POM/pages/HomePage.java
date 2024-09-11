package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
public HomePage VerifyHomePage()
{
	String title = driver.getTitle();
	if(title.contains("Testleaf"))
		System.out.println("Verified - User is on HomePage");
	else
		System.out.println("User is not on HomePage");
	return this;
	}

public CreateAccount ClickCreateAccount()
{
	driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	return new CreateAccount();
}
}
