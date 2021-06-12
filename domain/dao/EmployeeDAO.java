package domain.dao;

import domain.Employee;

public class EmployeeDAO {
	
//	DatabaseConnectionManager connectionManager;
	
	public void saveEmployee(Employee emp) {
//		DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//		
//		connectionManager.connect();
//		connectionManager.getConnectionObject().prepareStatement("insert ....");
//		connectionManager.disconnect();
		
		System.out.println("save employee to the database: " + emp);
		
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("delete employee from the database: " + emp);
	}

}
