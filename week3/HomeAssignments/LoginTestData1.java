package week3.HomeAssignments;

public class LoginTestData1 extends TestData{
	//SubClass - LoginTestData1 with 2 methods: enterUsername(), enterPassword()
	public void enterUsername()
	{
		System.out.println("Super/Parent Class:TestData");
		System.out.println("Sub Class-LoginTestData1: Enter User Name method");
	}
	public void enterPassword()
	{
		System.out.println("Super/Parent Class:TestData");
		System.out.println("Sub Class-LoginTestData1: Enter Password method");
	}
	public static void main(String[] args) {
		
		//Object creation and Method calls
		LoginTestData1 l1=new LoginTestData1();
		l1.enterCredentials();
		l1.enterPassword();
		l1.enterUsername();
		l1.enterPassword();
	}
}
