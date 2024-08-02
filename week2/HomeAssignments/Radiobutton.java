package week2.HomeAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the Browser and Load the URL https://www.leafground.com/radio.xhtml.
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//Add the ImplicityWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("(//div[@class='col-12']//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[3]")).click();
		
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
		String xpath="//label[text()='Chennai']/preceding-sibling::div";
		for(int i=0;i<=1;i++)
		{
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(2000);
		}
		
		boolean enabled = driver.findElement(By.xpath(xpath)).isSelected();
		if(enabled==true)
			System.out.println("Radiobutton Chennai is selected");
		else
			System.out.println("Radiobutton Chennai is unselected after second click");
		
		//Identify the radio button that is initially selected by default.
		WebElement chrome = driver.findElement(By.xpath("//input[@value='Option1']"));
		WebElement firefox = driver.findElement(By.xpath("//input[@value='Option2']"));
		WebElement safari = driver.findElement(By.xpath("//input[@value='Option3']"));
		WebElement edge = driver.findElement(By.xpath("//input[@value='Option4']"));
		
		if(chrome.isSelected())
			System.out.println("Chrome is selected by default");
		else if(firefox.isSelected())
				System.out.println("Firefox is selected by default");
		else if(safari.isSelected())
			System.out.println("Safari is selected by default");
		else if(edge.isSelected())
			System.out.println("Edge is selected");
		else
			System.out.println("No radio button is selected by default");
		
		//Check and select the age group (21-40 Years) if not already selected.
		boolean selected2 = driver.findElement(By.xpath("//input[@value='21-40 Years']")).isSelected();
		if(selected2==true)
			System.out.println("Age group 21-40 years radiobutton is selected by Default");
		else
		{
			driver.findElement(By.xpath("//input[@value='21-40 Years']")).click();
			System.out.println("Age group 21 - 40 years is selected during run of automation script");
		}
		driver.close();
	}

}
