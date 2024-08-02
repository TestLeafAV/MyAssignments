package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL http://leaftaps.com/opentaps/.
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window.
		driver.manage().window().maximize();
		
		//Enter a username and password.
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click the "Login" button.
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click on the "Accounts" tab.
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		//Click on the "Create Account" button.
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//Enter an account name.
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("AV Test1");
		
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
		
		//Enter a Number Of Employees.
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("1");
		
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps”");
		
		//Click the "Create Account" button.
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		Thread.sleep(5000);
		
		//Verify that the Title is displayed correctly.
		String title = driver.getTitle();
		System.out.println("Title is:"+title);
		
		if(title.contains("Account Details | opentaps CRM"))
			System.out.println("Title displayed correctly");
		else
			System.out.println("Title displayed incorrectly");
		
		//Close the browser window.
		driver.close();
	}

}
