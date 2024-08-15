package week4.HomeAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL (https://www.snapdeal.com/)
		driver.get("https://www.snapdeal.com/");
		
		//Go to "Men's Fashion".
		Actions obj=new Actions(driver);
		obj.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"))).perform();
		
		//Go to "Sports Shoes"
		obj.moveToElement(driver.findElement(By.xpath("//span[text()='Sports Shoes']"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		//Get the count of sports shoes.
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Total count of Sports shoes listed are: "+count);
		
		Thread.sleep(3000);
		
		//Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']/parent::a")).click();
		
		//Sort the products by "Low to High".
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		
		//Check if the displayed items are sorted correctly.
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		int size = elements.size();
		
		//Getting First and Last Item's price for sort check
		String firstItem=elements.get(0).getText();
		String lastItem = elements.get(size-1).getText();
		
		//Removing Rs. from String for convert to int
		String cropFirst=firstItem.substring(4);
		String cropSec=lastItem.substring(4);
		int fii=Integer.parseInt(cropFirst);
		int lii=Integer.parseInt(cropSec);
		
		//Check for sort
		if(lii>fii)
			System.out.println("Sort is done correctly");
		else
			System.out.println("Sort is incorrect");
		
		//Select any price range ex:(500-700).
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		
		Thread.sleep(3000);
		//Filter by any colour.
		driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[1]")).click();
		
		Thread.sleep(3000);
		
		//Mouse hover on the first resulting "Training Shoes".
		obj.moveToElement(driver.findElement(By.xpath("//img[@class='product-image wooble']"))).perform();
		Thread.sleep(3000);
		WebElement fr = driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']/following-sibling::div/div[contains(text(),'Quick View')]"));
		driver.executeScript("arguments[0].click();", fr);
		
		//Print the cost and the discount percentage.
		String dp = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The Discount provided on Shoe is: "+dp);
		String sp = driver.findElement(By.className("payBlkBig")).getText();
		System.out.println("Discounted Price/Selling Price of shoes:Rs. "+sp);
		
		//Take a snapshot of the shoes
		WebElement img = driver.findElement(By.xpath("//img[@itemprop='image']"));
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snapshots/shoe.png");
		FileUtils.copyFile(src, dest);
		
		//Close the current window
		driver.findElement(By.xpath("//div[@class='close close1 marR10']//i[@class='sd-icon sd-icon-delete-sign']")).click();
		
		//Close the main window.
		driver.close();
	}

}
