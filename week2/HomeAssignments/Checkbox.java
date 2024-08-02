package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		
		String str="Checked";
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL https://leafground.com/checkbox.xhtml
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		
		//Verify that the expected message is displayed.
		String text = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(text.contains(str))
			System.out.println("Expected Message: "+text+" is displayed, when Notification checkbox is checked");
		else
			System.out.println("Expected Message is not displayed, when Notification checkbox is checked");
		
		//Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();
		
		//Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("(//div[@class='col-12'])[4]//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		//Verify which tri-state option has been chosen.
		String text2 = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		System.out.println("Tri State chosen is: "+text2);
		
		//Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		//Verify that the expected message is displayed.
		String text3 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(text3.contains(str))
			System.out.println("Expected Message: "+text3+" is displayed, when Toggle is turned on");
		else
			System.out.println("Expected Message is not displayed, when Toggle is turned on");
		
		//Verify if the Checkbox is disabled.
		if(driver.findElement(By.xpath("//input[@disabled='disabled']")) != null)
			System.out.println("Checkbox is disabled");
		else
			System.out.println("Checkbox is not disabled");
		
		//Select multiple options on the page (details may be needed).
		
		//Barcelona
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Barcelona");
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank']/parent::div")).click();
		driver.findElement(By.xpath("//input[@role='textbox']")).clear();
		
		//Paris
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Paris");
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank']/parent::div")).click();
		driver.findElement(By.xpath("//input[@role='textbox']")).clear();
		
		//Rome
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Rome");
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank']/parent::div")).click();
		//driver.findElement(By.xpath("//input[@role='textbox']")).clear();
		
		//Close drop down
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
		Thread.sleep(4000);
		//Close browser
		driver.close();
	}
}
