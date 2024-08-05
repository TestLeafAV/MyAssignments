package week3.HomeAssignments;

public interface DatabaseConnection {
	
	//interface DatabaseConnection with abstract methods
	abstract void connect();
	abstract void disconnect();
	abstract void executeUpdate();

}
