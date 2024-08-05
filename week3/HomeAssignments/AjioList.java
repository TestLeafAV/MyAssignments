package week3.HomeAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Disable Web notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
						
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver(option);
				
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				                                                                            
		//Maximize window
		driver.manage().window().maximize();
		
		//Launch Ajio
		driver.get("https://www.ajio.com/");
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(3000);
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
		//Print the count of the items found
		String text = driver.findElement(By.xpath("//div[contains(@aria-label,' Items Found')]")).getText();
		System.out.println(text);
		
		//Get the list of brand of the products displayed in the page and print the list.
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//strong[text()='MORE'])[2]")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='facet-list-title-name']"));
		int size = elements.size();
		System.out.println("List of Bag Brands");
		System.out.print("\n");
		for(int i=0;i<size;i++)
		{
			String text2 = elements.get(i).getText();
			System.out.println(text2);
		}
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		System.out.print("\n");
		
		//Get the list of names of the bags and print it
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int size2 = bagNames.size();
		System.out.println("List of Bag Names");
		System.out.print("\n");
		for(int j=0;j<size2;j++)
		{
			String text3 = bagNames.get(j).getText();
			System.out.println(text3);
		}
		
		Thread.sleep(3000);
		
		//Close Browser
		driver.close();
		
	}

}
