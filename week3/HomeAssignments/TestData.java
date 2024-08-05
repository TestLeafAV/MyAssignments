package week3.HomeAssignments;

public class TestData {
	
	//superclass - TestData with 2 methods: enterCredentials(), navigateToHomePage()
	public void enterCredentials()
	{
		System.out.println("Super class: Credentials");
	}
	public void navigateToHomePage()
	{
		System.out.println("Super Class: Home Page");
	}
	public static void main(String[] args) 
	{	
		//Object creation and method calls
		TestData t=new TestData();
		t.enterCredentials();
		t.navigateToHomePage();
	}
}
