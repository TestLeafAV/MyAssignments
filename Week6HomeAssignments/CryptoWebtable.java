package week6.HomeAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CryptoWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the url - https://finance.yahoo.com/
		driver.get("https://finance.yahoo.com");
		
		//Click on “Crypto” tab
		driver.findElement(By.xpath("//span[text()='More']")).click();
		driver.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();
		
		//Locate the table in the dom page 
		//Locate the cryptocurrency names in the table using specific row and column.
		List<WebElement> elements = driver.findElements(By.xpath("//div//table[@data-testid='table-container']/tbody/tr"));
		
		//Use loop to iterate the cryptocurrency names
		int row = elements.size();
		System.out.println("Cryptocurrency Names");
		for (int i = 1; i <= row; i++) {
			String xpath="//div//table[@data-testid='table-container']//tr[@id='"+i+"']/td";
			String cName=driver.findElement(By.xpath(xpath)).getText();
			//Print the cryptocurrency names
			System.out.println(cName);
		}
		
		driver.close();

	}

}
