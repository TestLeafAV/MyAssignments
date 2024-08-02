package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) {
		
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL http://leaftaps.com/opentaps/.
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter a username and password.
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click the "Login" button.
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click on the "Leads" tab.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click on the "Create Lead" button.
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Enter a FirstName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Aishwarya");
		
		//Enter a LastName
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vijayanandan");
		
		//Enter a CompanyName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("abc");
		
		//Enter a Title .
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("xyz");
		
		//Click the "Create Lead" button.
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		System.out.println("Title of page is "+title);
		
		if(title.contains("View Lead | opentaps CRM"))
			System.out.println("Title Displayed correctly");
		else
			System.out.println("Title is incorrect");
		
		//Close the browser window.
		driver.close();
		
	}
}
