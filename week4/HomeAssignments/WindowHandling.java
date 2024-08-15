package week4.HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL (http://leaftaps.com/opentaps/control/login)
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter the user name and password.
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click on the Login button.
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//Click on the CRM/SFA link.
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click on the Contacts button.
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Click on Merge Contacts.
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		//Handling Windows
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> w=new ArrayList<String>(windowHandles);
		driver.switchTo().window(w.get(1));
		
		//Click on the first resulting contact.
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		//switch driver control back to main page
		driver.switchTo().window(w.get(0));
		
		//Click on the widget of the "To Contact".
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		//Handling Windows
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> newWin=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(newWin.get(1));
		
		//Click on the first resulting contact.
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		//Switch Driver Control back to Main page
		driver.switchTo().window(newWin.get(0));
		
		//Click on the Merge button.
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		//Accept the alert.
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Verify the title of the page.
		String title = driver.getTitle();
		System.out.println("Title of Page is:"+title);
		if(title.contains("Merge Contacts"))
			System.out.println("Title Verification Success");
		else
			System.out.println("Title Verification failed");
		
		//close browser
		driver.close();
		
	}

}
