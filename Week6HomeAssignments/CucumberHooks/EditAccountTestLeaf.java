package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccountTestLeaf extends ProjectSpecificMethod{
	@When("lead is searched")
	public void lead_is_searched() throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Lead details are edited and submitted")
	public void lead_details_are_edited_and_submitted() {
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCS");
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Verify Lead is updated")
	public void verify_lead_is_updated() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TCS")) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}
		driver.close();
	}

}
