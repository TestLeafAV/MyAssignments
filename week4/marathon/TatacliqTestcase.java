package week4.marathon;

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
import org.openqa.selenium.support.ui.Select;

public class TatacliqTestcase {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		driver.findElement(By.id("wzrk-cancel")).click();
		Actions obj=new Actions(driver);
		
		//MouseHover on 'Brands'
		obj.moveToElement(driver.findElement(By.xpath("//div[text()='Brands']"))).perform();
		
		//MouseHover on 'Watches & Accessories'
		obj.moveToElement(driver.findElement(By.xpath("//div[text()='Watches & Accessories']"))).perform();
		
		//Choose the first option from the 'Featured brands'.
		WebElement fb = driver.findElement(By.xpath("//div[text()='Featured brands']/following-sibling::div"));
		obj.moveToElement(fb).perform();
		Thread.sleep(3000);
		fb.click();
		
		//Select sortby: New Arrivals
		WebElement dd = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select options=new Select(dd);
		options.selectByVisibleText("New Arrivals");
	
		//choose men from categories filter.
		driver.findElement(By.xpath("//div[@class='CheckBox__base']")).click();
		
		Thread.sleep(3000);
		
		//print all price of watches
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		for(int i=0;i<pricelist.size();i++)
		{
			System.out.println(pricelist.get(i).getText());
		}
		
		//click on the first resulting watch
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		
		
		//compare two price are similar
		String fp = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']//h3")).getText();
		String fpn = fp.substring(1);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wh=new ArrayList<String>(windowHandles);
		driver.switchTo().window(wh.get(1));
		String np = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']//h3")).getText();
		String npn = np.substring(6);
		if(fpn.equals(npn))
			System.out.println("Prices Match");
		else
			System.out.println("Price Mismatch");
		
		//click Add to cart and get count from the cart icon.
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String count = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Number of items added in cart is: "+count);
		
		Thread.sleep(2000);
		//Click on the cart
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		
		Thread.sleep(4000);
		
		//Take a snap of the resulting page
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Snapshots/res.png");
		FileUtils.copyFile(src, dest);
		
		//Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(wh.get(0));
		driver.close();
	}

}
