package week3.HomeAssignments;

public class Polymorphism {
	
	//define the reportStep method with multiple overloaded versions: - 
	//One version should accept two input arguments: a String for the message (msg) and another String for the status (status).
	public void reportStep(String msg, String status)
	{
		System.out.println("Report Step Method with 2 Arguments: String Message and String Status");
		System.out.println("Message : "+msg);
		System.out.println("Status : "+status);
	}
	
	//Another version of the reportStep method should accept three input arguments: 
	//a String for the message (msg), a String for the status (status), and a boolean parameter (snap) to indicate whether to take a snapshot.
	public void reportStep(String msg, String status,boolean snap)
	{
		System.out.println("Report Step Method with 3 Arguments: String Message, String Status and Boolean Snap");
		System.out.println("Message : "+msg);
		System.out.println("Status : "+status);
		System.out.println("Take Snap (True/false) ? "+snap);
	}
	
	//Create a main method to demonstrate the usage of the overloaded reportStep method.
	public static void main(String[] args) {
		
		//Call both versions of the reportStep method with different sets of input arguments to showcase method overloading.
		Polymorphism p=new Polymorphism();
		p.reportStep("First", "Success");
		p.reportStep("Second", "Success", false);
		
	}
}
