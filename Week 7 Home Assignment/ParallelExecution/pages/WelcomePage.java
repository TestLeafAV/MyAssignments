package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{
	
	public WelcomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePage ClickOnCrmsfa()
	{
		driver.findElement(By.xpath("//a[contains(text(),CRM/SFA)]")).click();
		return new HomePage(driver);
	}
	
	public LoginPage logout()
	{
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new LoginPage(driver);
	}

}
