package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateAccount extends ProjectSpecificMethod{

	public CreateAccount enterAccName()
	{
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("AV Test1");
		return this;
	}
	
	public CreateAccount enterdesc()
	{
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
		return this;
	}
	
	public CreateAccount enterEmp()
	{
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("1");
		return this;
	}
	public CreateAccount enterSite()
	{
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps”");
		return this;
	}
	public CreateAccount clickCreateAccButton()
	{
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		return this;
	}
	public CreateAccount verifyEndPage()
	{
		String titleacc = driver.getTitle();
		System.out.println("Title is:"+titleacc);
		
		if(titleacc.contains("Account Details | opentaps CRM"))
			System.out.println("Title displayed correctly");
		else
			System.out.println("Title displayed incorrectly");
		return this;
	}
}
