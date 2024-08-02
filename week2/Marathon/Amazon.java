package week2.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch Chrome  
		ChromeDriver driver=new ChromeDriver();
		
		//Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		//add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Type "Bags for boys" in the Search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		Thread.sleep(2000);
		
		//Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//div[@class='left-pane-results-container']/div")).click();
		
		//To click Search button
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(2000);
		
		//Print the total number of results (like 50000) 1-48 of over 50,000 results for "bags for boys"
		String Res = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		String Search = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)[3]")).getText();
		System.out.println("Result: \n"+Res+" "+Search);
		
		Thread.sleep(2000);
		
		//Select the first 2 brands in the left menu (like American Tourister, Generic)
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		
		Thread.sleep(4000);
		
		//Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		Thread.sleep(4000);
		
		//Print the first resulting bag info (name, discounted price)
		System.out.println("Search Result 1");
		String Brand = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println("Brand Name of Bag: "+Brand);
		String DP = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Discounted Price: "+DP);
		
		//Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println("Title of Page is: "+title);
		driver.close();
		
		
		
	}

}
