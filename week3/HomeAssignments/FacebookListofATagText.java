package week3.HomeAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookListofATagText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL - Facebook
		driver.get("https://www.facebook.com/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Implicit wait of 30 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//List of A Tag Webelements
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		//Size of List
		int size = elements.size();
		
		System.out.println("Number of A Tags in Facebook Home Page is: "+size+"\n");
		System.out.println("List of A Tags is as follows:");
		
		//For loop to display all A Tag webelement's stored in List
		for(int i=0;i<size;i++)
		{
			//Text retrieved from webelements list 
			String text = elements.get(i).getText();
			System.out.println(text);
		}
		
		//Close of Browser
		driver.close();
	}

}
