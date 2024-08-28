package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccountSalesforce {
	public ChromeDriver driver;
	public Actions action;
	public String phone="";
	@Given("Browser Launched and URL loaded")
	public void browser_launched_and_url_loaded() throws InterruptedException {
	driver=new ChromeDriver();    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Login to https://login.salesforce.com
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("testleaf@2024",Keys.ENTER);
	Thread.sleep(3000);
	}

	@When("Click the App Launcher Icon next to Setup")
	public void click_the_app_launcher_icon_next_to_setup() throws InterruptedException {
	driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	Thread.sleep(3000); 	  
	}

	@When("Select Accounts is clicked")
	public void select_accounts_is_clicked() {
	WebElement element = driver.findElement(By.xpath("//div[@class='slds-context-bar']//a//span[text()='Accounts']"));
	driver.executeScript("arguments[0].click();", element);	    
	}

	@When("Account Name is located")
	public void account_name_is_located() throws InterruptedException {
	driver.findElement(By.xpath("//input[@aria-label='Search Recently Viewed list view.']")).sendKeys("Aish",Keys.ENTER);
	Thread.sleep(3000);	   
	}

	@When("Edit is clicked")
	public void edit_is_clicked() {
		driver.findElement(By.xpath("//div[@data-aura-class='forceVirtualAction']//a//span")).click();
		driver.findElement(By.xpath("//li[@data-aura-class='uiMenuItem']//a[@title='Edit']")).click();
	}

	@When("Type is set to Technology Partner")
	public void type_is_set_to_technology_partner() {
		driver.findElement(By.xpath("//label[text()='Type']/ancestor::slot[@name='inputField']//*[local-name()='button']")).click();
		driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
	}

	@When("Industry is set to Healthcare")
	public void industry_is_set_to_healthcare() {
		driver.findElement(By.xpath("//label[text()='Industry']/ancestor::records-record-picklist[@slot='inputField']//*[local-name()='button']")).click(); 
		WebElement health = driver.findElement(By.xpath("//span[text()='Healthcare']"));
		action=new Actions(driver);
		action.moveToElement(health).click().perform();
	}
	@When("Billing Street {string} is entered")
	public void billing_street_is_entered(String bs) {
		driver.findElement(By.xpath("(//textarea[@name='street'])[1]")).sendKeys(bs);
		
	}

	@When("Shipping Street {string} is entered")
	public void shipping_street_is_entered(String ss) {
		driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys(ss);
		
	}

	@When("Billing City {string} is entered")
	public void billing_city_is_entered(String bc) {
		driver.findElement(By.xpath("(//input[@name='city'])[1]")).sendKeys(bc);
		
	}

	@When("Shipping City {string} is entered")
	public void shipping_city_is_entered(String sc) {
		driver.findElement(By.xpath("(//input[@name='city'])[2]")).sendKeys(sc);
			
	}

	@When("Billing PIN {string} is entered")
	public void billing_pin_is_entered(String bpc) {
		driver.findElement(By.xpath("(//input[@name='postalCode'])[1]")).sendKeys(bpc);

	}

	@When("Shipping PIN {string} is entered")
	public void shipping_pin_is_entered(String spc) {
		driver.findElement(By.xpath("(//input[@name='postalCode'])[2]")).sendKeys(spc);

	}

	@When("Billing State {string} is entered")
	public void billing_state_is_entered(String bsp) {
		driver.findElement(By.xpath("(//input[@name='province'])[1]")).sendKeys(bsp);

	}

	@When("Shipping State {string} is entered")
	public void shipping_state_is_entered(String ssp) {
		driver.findElement(By.xpath("(//input[@name='province'])[2]")).sendKeys(ssp);

	}

	@When("Billing Country {string} is entered")
	public void billing_country_is_entered(String bn) {
		driver.findElement(By.xpath("(//input[@name='country'])[1]")).sendKeys(bn);

	}

	@When("Shipping Country {string} is entered")
	public void shipping_country_is_entered(String sn) {
		driver.findElement(By.xpath("(//input[@name='country'])[2]")).sendKeys(sn);
	}


	@When("Customer Priority is set To Low")
	public void customer_priority_is_set_to_low() {
		action.scrollToElement(driver.findElement(By.xpath("//span[text()='Created By']"))).perform();
		//Set Customer Priority to Low.
		driver.findElement(By.xpath("//label[text()='Customer Priority']/ancestor::records-record-picklist//*[local-name()='button']")).click();
		driver.findElement(By.xpath("//span[text()='Low']")).click();
	}

	@When("SLA set to Silver")
	public void sla_set_to_silver() {
		driver.findElement(By.xpath("//label[text()='SLA']/ancestor::records-record-picklist//*[local-name()='button']")).click();
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
	}

	@When("Active set to No")
	public void active_set_to_no() {
		//Set Active to NO.
		WebElement active = driver.findElement(By.xpath("//label[text()='Active']/ancestor::records-record-picklist//*[local-name()='button']"));
		driver.executeScript("arguments[0].click();", active);
		driver.findElement(By.xpath("//span[text()='No']")).click();
	}

	@When("Unique {string} is entered")
	public void unique_is_entered(String phNo) {
		WebElement ph = driver.findElement(By.xpath("//input[@name='Phone']"));
		action.moveToElement(ph).perform();
		//String phNo="1234567890";
		ph.sendKeys(phNo);
		phone=phNo;
	}

	@When("Upsell Opportunity is set to {string}")
	public void upsell_opportunity_is_set_to(String no) {
		action.scrollToElement(driver.findElement(By.xpath("//span[text()='Created By']"))).perform();
		driver.findElement(By.xpath("//label[text()='Upsell Opportunity']/ancestor::records-record-picklist//*[local-name()='button']")).click();
		String xpath="//span[text()='"+no+"']";
		driver.findElement(By.xpath(xpath)).click();
	}

	@When("Save is clicked")
	public void save_is_clicked() throws InterruptedException {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		Thread.sleep(3000);
	}

	@Then("Verify Phone number is entered correctly in record")
	public void verify_phone_number_is_entered_correctly_in_record() {
		String phNum = driver.findElement(By.xpath("//table[@role='grid']//tr[1]/td[4]//span//span")).getText();
		if(phone.equals(phNum))
			System.out.println("Phone Number saved is correct");
		else
			System.out.println("Incorrect");
		driver.close();
		}
}
