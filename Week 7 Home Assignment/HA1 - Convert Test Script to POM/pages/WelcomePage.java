package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{
	
	public HomePage ClickOnCrmsfa()
	{
		driver.findElement(By.xpath("//a[contains(text(),CRM/SFA)]")).click();
		return new HomePage();
	}
	
	public LoginPage logout()
	{
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new LoginPage();
	}

}
