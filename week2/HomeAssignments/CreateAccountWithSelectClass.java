package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {
	public static void main(String[] args) {
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
				String acc="AV Test-Select13";
				driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(acc);
				
				//Enter a description as "Selenium Automation Tester."
				driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
				
				//Select "ComputerSoftware" as the industry.
				WebElement dd = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
				Select obj=new Select(dd);
				obj.selectByValue("IND_SOFTWARE");
				
				//Select "S-Corporation" as ownership using SelectByVisibleText.
				WebElement own = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
				Select obj1=new Select(own);
				obj1.selectByVisibleText("S-Corporation");
				
				//Select "Employee" as the source using SelectByValue.
				WebElement emp = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
				Select obj2=new Select(emp);
				obj2.selectByValue("LEAD_EMPLOYEE");
				
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
				WebElement mc = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
				Select obj3=new Select(mc);
				obj3.selectByIndex(7);
				
				//Select "Texas" as the state/province using SelectByValue.
				WebElement sp = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
				Select obj4=new Select(sp);
				obj4.selectByValue("TX");
				
				//Click the "Create Account" button.
				driver.findElement(By.xpath("//input[@value='Create Account']")).click();
				
				//Verify that the account name is displayed correctly
				String text = driver.findElement(By.xpath("//span[contains(text(),'AV Test-Select')]")).getText();
				System.out.println(text);
				if(text.contains(acc))
					System.out.println("Account Name is correct");
				else
					System.out.println("Account Name is incorrect");
				
				//Title Check
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("Account Details | opentaps CRM"))
					System.out.println("Title is displayed correctly");
				else
					System.out.println("Title is incorrect");
				
				//Close the browser window.
				driver.close();
				
	}
}
