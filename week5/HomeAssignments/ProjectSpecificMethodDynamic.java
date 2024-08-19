package week5.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethodDynamic {
	public ChromeDriver driver;
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	public void preCondition(String url,String uname,String pwd) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Login to https://login.salesforce.com
		driver.get(url);
		
		// Username: dilip@testleaf.com
		driver.findElement(By.id("username")).sendKeys(uname);
		
		//Password: testleaf@2024
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
	}
	@AfterMethod
	public void postCondition() 
	{
		driver.close();
	}
}
