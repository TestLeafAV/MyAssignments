package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	
	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
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
	return new CreateAccount(driver);
}
}
