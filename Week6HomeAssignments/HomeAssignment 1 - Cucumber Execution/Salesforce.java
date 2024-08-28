package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Salesforce {
	public ChromeDriver driver;
	public ChromeOptions options;
	
	@Given("Load Url and Launch Salesforce with valid credentials")
	public void load_url_and_launch_salesforce_with_valid_credentials() {
		//options.addArguments("--disable-notifications");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024",Keys.ENTER);
	}

	@When("Click on toggle menu button")
	public void click_on_toggle_menu_button() {
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	}

	@When("Click view All")
	public void click_view_all() {
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	}

	@When("click Sales")
	public void click_sales() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
		WebElement element = driver.findElement(By.xpath("//div[@class='slds-context-bar']//a//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", element);
	}

	@When("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@When("Enter your name as account name")
	public void enter_your_name_as_account_name() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Aish");
	}

	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
		driver.findElement(By.xpath("//div[@class='slds-form-element__control']//button[@aria-label='Ownership']")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("Click save")
	public void click_save() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("Verify Account creation is Successful")
	public void verify_account_creation_is_successful() {
		WebElement element2 = driver.findElement(By.xpath("//lightning-formatted-text[text()='Aish']"));
		String text = element2.getText();
		if(text.equals("Aish"))
			System.out.println("Success");
		else
			System.out.println("Fail");
		driver.close();
		}
}
