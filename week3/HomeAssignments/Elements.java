package week3.HomeAssignments;

public class Elements extends Button{
	//class Elements inherited from Button to call all inherited methods
	public static void main(String[] args) {
		
		//Object of Execution class - Elements
		Elements obj=new Elements();
		
		//call to all inherited methods
		obj.click();
		obj.setText("Call from Class - Elements");
		obj.submit();
		
	}

}
