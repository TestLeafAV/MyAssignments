package week2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Enter the First name.
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		
		//Enter the Surname.
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testemail@gmail.com");
		
		//Enter the New password.
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("PassPwd");
		
		//Handle all three dropdowns in Date of birth
		WebElement dd = driver.findElement(By.xpath("//select[@id='day']"));
		Select obj=new Select(dd);
		obj.selectByValue("31");
		
		WebElement mon = driver.findElement(By.xpath("//select[@id='month']"));
		Select obj1=new Select(mon);
		obj1.selectByValue("8");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select obj2=new Select(year);
		obj2.selectByValue("2000");
		
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		driver.close();
		
	}
}
