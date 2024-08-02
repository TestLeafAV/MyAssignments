package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
				
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
		
		//Click the "Leads" link.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click "Find leads."
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter the phone number.
		//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		//driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		
		
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(10000);
		
		//Capture the lead ID of the first resulting lead.
	
		String text3=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("Lead to be deleted is:"+text3);
		String xpa="//a[text()='";
		String conc = xpa.concat(text3).concat("']");
		System.out.println("Xpath of "+text3+" is:"+conc);
		
		
		//Click the first resulting lead.
		driver.findElement(By.xpath(conc)).click();
		
		//Click the "Delete" button.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click "Find leads" again
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(text3);
		
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println("Message displayed after delete is: "+text2);
		System.out.println("Verification of Message");
		if(text2.contains("No records to display"))
			System.out.println("Success");
		else
			System.out.println("Failed");
		
		Thread.sleep(6000);
		
		//Close the browser.
		driver.close();
	
	}
}
