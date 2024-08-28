package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSalesforce {
	public ChromeDriver driver;
	public String n="";
	@Given("Salesforce is launched and user is logged in")
	public void salesforce_is_launched_and_user_is_logged_in() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		driver.findElement(By.id("Login")).click();
	}

	@When("Menu button is clicked")
	public void menu_button_is_clicked() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@When("View All options is clicked")
	public void view_all_options_is_clicked() {
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	}

	@When("Sales option is clicked")
	public void sales_option_is_clicked() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("Accounts Tab is clicked")
	public void accounts_tab_is_clicked() throws InterruptedException {
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//div[@class='slds-context-bar']//a//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", element);
		
	}

	@When("New buttton is clicked")
	public void new_buttton_is_clicked() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(3000);
	}

	@When("{string} is entered for Account")
	public void name_is_entered_for_account(String name) {
		n=name;
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}
	@When("Ownership is selected as Public")
	public void ownership_is_selected_as_public() {
		driver.findElement(By.xpath("//div[@class='slds-form-element__control']//button[@aria-label='Ownership']")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		
	}
	@When("Save button is clicked")
	public void save_button_is_clicked() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@Then("Verify Account is created with entered name")
	public void verify_account_is_created_with_entered_name() {
		String xpath="//lightning-formatted-text[text()='"+n+"']";
		WebElement element2 = driver.findElement(By.xpath(xpath));
		String text = element2.getText();
		if(text.equals(n))
			System.out.println("Success");
		else
			System.out.println("Fail");
		driver.close();
	}

	
	    
	}


