package week4.HomeAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionAmazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL (https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		
		//Search for "one plus 9 pro".
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Get the price of the first product
		String price = driver.findElement(By.xpath("(//div[@class='puisg-row']//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of First Search Result for oneplus 9 pro is: Rs."+price);
		
		//Print the number of customer ratings for the first displayed product
		String cr = driver.findElement(By.xpath("(//div[@class='a-row a-size-small']//a[@target='_blank'])[1]")).getText();
		System.out.println("Number of customer ratings is: "+cr);
		
		//Click the first text link of the first image
		driver.findElement(By.xpath("(//div[@data-cy='title-recipe']//a[@target='_blank'])[1]")).click();
		
		//Handling Windows
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		
		//Switching to new opened tab
		driver.switchTo().window(window.get(1));
		
		//Take a screenshot of the product displayed.
		WebElement img = driver.findElement(By.xpath("//span[@class='a-declarative']//img[@id='landingImage']"));
		File src=img.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Snapshots/img.png");
		FileUtils.copyFile(src, dest);
		
		//Click the 'Add to Cart' button.
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		Thread.sleep(3000);
		
		//Get the cart sub total and verify if it is correct.
		String text = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Cart Sub Total value is: "+text);
		if(text.contains(price))
			System.out.println("Verified - Cart Sub Total is correct");
		else
			System.out.println("Cart Sub Total is incorrect");
		
		//Close the browser
		driver.quit();
	}

}
