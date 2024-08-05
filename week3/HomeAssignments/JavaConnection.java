package week3.HomeAssignments;

public class JavaConnection implements DatabaseConnection{
	//Concrete class JavaConnection implementing from Interface DatabaseConnection
	
	//implementations for the abstract methods
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute Update");
	}

	public static void main(String[] args) {
	JavaConnection jc=new JavaConnection();
	jc.connect();
	jc.disconnect();
	jc.executeUpdate();
}
}
