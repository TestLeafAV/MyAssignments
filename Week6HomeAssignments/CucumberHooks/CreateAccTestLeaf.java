package stepDef;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccTestLeaf extends ProjectSpecificMethod{

@When("create lead is selected")
public void create_lead_is_selected() {
	driver.findElement(By.linkText("Create Lead")).click();
}

@When("Lead details are provided and submitted")
public void lead_details_are_provided_and_submitted() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	driver.findElement(By.name("submitButton")).click();
}

@Then("Verify Lead is created")
public void verify_lead_is_created() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Testleaf")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
	}
}
}
