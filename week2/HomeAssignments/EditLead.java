package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		
		//Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("ABC");
		
		//Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Aishwarya");
				
		//Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vijayanandan");
		
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Aish");
		
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		
		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Desc entered during Automation");
		
		//Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("testmail@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement sp = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select obj=new Select(sp);
		obj.selectByVisibleText("New York");
		
		//Click on the Create Button.
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//Click on the edit button.
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clear the Description Field.
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		
		//Fill the Important Note Field with Any text.
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Imp Note entered during automation run");
		
		//Click on the update button.
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		Thread.sleep(4000);
		
		//Get the Title of the Resulting Page.
		String title = driver.getTitle();
		System.out.println("Title of Page is: "+title);
		
		//Close the browser window.
		driver.close();
		
	}

}
