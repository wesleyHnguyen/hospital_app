package database;


public class DatabaseConnectionManager {

//	private Connection conn;
	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	
	public static DatabaseConnectionManager getManagerInstance() {
		return connectionInstance;
	}
	
	public void connect() {}
	
	public void getConnectionObject() {}

	public void disconnect() {}
}
