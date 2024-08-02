package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL https://leafground.com/button.xhtml .
		driver.get("https://leafground.com/button.xhtml");
		
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//Verify that the title of the page is ‘dashboard.’
		String d="Dashboard";
		String title = driver.getTitle();
		if(d.contains(title))
			System.out.println("Title of Page: "+title+" is displayed correctly");
		else
			System.out.println("Title of page is incorrect");
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		driver.navigate().back();
		WebElement dd = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		if(dd.isEnabled())
			System.out.println("Button is enabled");
		else
			System.out.println("Button is disabled");
		
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getLocation();
		System.out.println("Location of Button is: "+location);
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
		System.out.println("Background Color of button is: "+cssValue);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Dimension of button is: "+size);
		
		Thread.sleep(3000);
		
		//Close the browser window.
		driver.close();
		
	}

}
