package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}

public LoginPage VerifyLoginPage()
{
 String text = driver.findElement(By.id("appDescr")).getText();
 if(text.contains("Welcome to Leaftaps"))
	 System.out.println("Verified - User on Login Page");
 else
	 System.out.println("User not on Login Page");
 return this;
}
public LoginPage enterUserName()
{
	driver.findElement(By.className("inputLogin")).sendKeys("DemoSalesManager");
	return this;
}
public LoginPage enterPassword()
{
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	return this;
}
public WelcomePage clickLogin()
{
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage(driver);
}
}
