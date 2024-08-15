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
import org.openqa.selenium.interactions.Actions;

public class ActionBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL (https://www.bigbasket.com/)
		driver.get("https://www.bigbasket.com/");
		
		//Click on "Shop by Category
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();
		
		Thread.sleep(3000);
		
		//Mouse over "Foodgrains, Oil & Masala".
		Actions opt=new Actions(driver);
		opt.moveToElement(driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"))).perform();
		
		//Mouse over "Rice & Rice Products".
		opt.moveToElement(driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"))).perform();
		
		//Click on "Boiled & Steam Rice".
		opt.moveToElement(driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		
		Thread.sleep(5000);
		//Filter the results by selecting the brand "bb Royal".
		WebElement element = driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		driver.executeScript("arguments[0].click();", element);
		
		Thread.sleep(3000);
		
		//Click on "Tamil Ponni Boiled Rice".
		driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]")).click();
		
		//switching to new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wh=new ArrayList<String>(windowHandles);
		driver.switchTo().window(wh.get(1));
		
		Thread.sleep(3000);
		
		//Select the 5 Kg bag.
		WebElement kg = driver.findElement(By.xpath("//span[text()='5 kg']"));
		driver.executeScript("arguments[0].click();", kg);
		
		//Check and note the price of the rice
		String price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		System.out.println(price);
		
		//Click "Add" to add the bag to your cart
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		
		Thread.sleep(3000);
		
		//Verify the success message that confirms the item was added to your cart.
		String msg = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
		if(msg.contains("success"))
			System.out.println(msg);
		else
			System.out.println("Item not added to cart");
		
		Thread.sleep(3000);
		
		//Take a snapshot of the current page
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Snapshots/cart.png");
		FileUtils.copyFile(src, dest);
		
		//Close the current window.
		driver.close();
		
		//Close the main window.
		driver.switchTo().window(wh.get(0));
		driver.close();
	}

}
