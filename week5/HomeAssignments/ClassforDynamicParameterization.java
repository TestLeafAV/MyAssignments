package week5.HomeAssignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ClassforDynamicParameterization extends ProjectSpecificMethodDynamic{
@DataProvider(name="ename")	
public String[][] setValue()
{
	String[][] data=new String[2][3];
	data[0][0]="Aish";
	data[0][1]="TestLeaf";
	data[0][2]="Salesforce";
	data[1][0]="Aishwarya";
	data[1][1]="TestLeaf 2";
	data[1][2]="Salesforce 2";
	return data;
}
@Test(dataProvider="ename")
	public void salesforce(String ename,String comp, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		////Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		driver.findElement(By.xpath("//mark[contains(text(),'Legal Entities')]")).click();
		
		//Click on New Legal Entity
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by "+ename);
		
		//Enter the Company name as 'TestLeaf
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(comp);
		
		//Enter Description as 'Salesforces'.
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys(desc);
		
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
		Thread.sleep(3000);
		String xpath="//div[text()='Salesforce Automation by "+ename+"']";
		String compare="Salesforce Automation by "+ename;
		String result = driver.findElement(By.xpath(xpath)).getText();
		if(result.equals(compare))
			System.out.println("Legal Entity Name has been entered correctly");
		else
			System.out.println("Legal Entity Name entered is incorrect");
		Thread.sleep(3000);
		
	

}
}
