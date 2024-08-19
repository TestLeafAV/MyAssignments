package week5.HomeAssignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TestClass extends ProjectSpecificMethod{
@Test
	public void salesforce() {
		// TODO Auto-generated method stub
		
		
		////Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		driver.findElement(By.xpath("//mark[contains(text(),'Legal Entities')]")).click();
		
		//Click on New Legal Entity
		driver.findElement(By.xpath("(//*[local-name()='svg' and @data-key='chevrondown'])[6]")).click();
		WebElement newL = driver.findElement(By.xpath("//a//span[text()='New Legal Entity']"));
		driver.executeScript("arguments[0].click();", newL);
		String len="Automation by Aish";
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(len);
		
		//Enter the Company name as 'TestLeaf
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		
		//Enter Description as 'Salesforces'.
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("Salesforces");
		
		//Select Status as 'Active'
		driver.findElement(By.xpath("//button[@role='combobox']")).click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		
		//Click on Save
		driver.findElement(By.xpath("(//button[contains(text(),\"Save\")])[2]")).click();
		
		//Verify the Alert message (Complete this field) displayed for Name
		WebElement element = driver.findElement(By.xpath("//lightning-icon[@icon-name='utility:success']"));
		String text = element.getText();
		if(text.contains("Success"))
			System.out.println("Legal Entity created successfully");
		else
			System.out.println("Legal Entity creation failed");
		String xpath="//div[text()='"+len+"']";
		String result = driver.findElement(By.xpath(xpath)).getText();
		if(result.equals(len))
			System.out.println("Legal Entity Name has been entered correctly");
		else
			System.out.println("Legal Entity Name entered is incorrect");
		
	

}
}
