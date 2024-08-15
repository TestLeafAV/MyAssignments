package week4.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt)
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		
		//Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Click OK/Cancel in the alert that appears
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//Confirm the action is performed correctly by verifying the text displayed
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(text.equals("Hello Harry Potter! How are you today?"))
		{
			System.out.println("Verified. Alert is accepted.");
			System.out.println(text);
		}
		else
			System.out.println("Failed");
		
		//Closing Browser
		driver.close();
		
	}

}
