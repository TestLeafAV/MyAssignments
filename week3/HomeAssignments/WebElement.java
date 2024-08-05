package week3.HomeAssignments;

public class WebElement {
	
	//Base class named WebElement with methods such as click() and setText(String text).
	public void click()
	{
		System.out.println("Super Class-WebElement's method - Click");
	}
	public void setText(String text)
	{
		System.out.println("Super Class-WebElement's method - Set Text");
		System.out.println("String passed is: "+text);
	}
}
