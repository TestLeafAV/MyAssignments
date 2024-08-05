package week3.HomeAssignments;

public class LoginTestData2 extends TestData{
	//SubClass - LoginTestData2 with 2 methods: enterUsername(), enterPassword()
	public void enterUsername()
	{
		System.out.println("Super/Parent Class:TestData");
		System.out.println("Sub Class-LoginTestData2: Enter User Name method");
	}
	public void enterPassword()
	{	
		System.out.println("Super/Parent Class:TestData");
		System.out.println("Sub Class-LoginTestData2: Enter Password method");
	}
	public static void main(String[] args) 
	{
		//Object creation and method calls
		LoginTestData2 l2=new LoginTestData2();
		l2.enterCredentials();
		l2.enterPassword();
		l2.enterUsername();
		l2.enterPassword();
	}
}
