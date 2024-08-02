package week2.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVR {

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
		
		//Load the Url "https://www.pvrcinemas.com/"
		driver.get("https://www.pvrcinemas.com/");
		
		Thread.sleep(3000);
		
		//Choose Your location as "Chennai"
		driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		System.out.println("Location chosen as Chennai");
		
		//Click on Cinema under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		System.out.println("Quick book chosen as Cinema");
		
		//Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		System.out.println("Cinema Hall is selected");
		
		//Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		System.out.println("Date selected as Tomorrow");
		
		//Select Your Movie
		driver.findElement(By.xpath("(//span[text()='RAAYAN'])[2]")).click();
		System.out.println("Movie selected is RAAYAN");
		
		//Select Your Show Time
		driver.findElement(By.xpath("//span[text()='10:15 PM']")).click();
		System.out.println("Show Time chosen is 10:15 PM");
		
		//Click on Book Button
		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
		
		//Accept to A rate movie
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		Thread.sleep(3000);
		
		// Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		System.out.println("Accepting to Terms and Conditions");
		
		//Click any one available seat
		driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
		System.out.println("Available seat is selected");
		
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		System.out.println("Proceeding to finaly booking");
		
		//Print the Seat info under book summary
		String seat = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("Seat Number is: "+seat);
		
		//Print the grand total under book summary
		String GT = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
		System.out.println("Grand Total is: "+GT);
		
		Thread.sleep(3000);
		
		//Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		Thread.sleep(3000);
		//Close the popup
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]//i")).click();
		
		Thread.sleep(3000);
		
		//Print Your Current Page title
		String title = driver.getTitle();
		System.out.println("Title of current page is: "+title);
		
		driver.close();
		
	}

}
