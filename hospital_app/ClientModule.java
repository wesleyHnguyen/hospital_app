package hospital_app;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {
	
	public static void main(String[] args) {
		Employee jane = new Employee(1, "jane", "accounting", true);
		ClientModule.hireNewEmployee(jane);
		
		printEmployeeReport(jane, FormatType.XML);
	}
	
	public static void hireNewEmployee(Employee emp) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		employeeDAO.saveEmployee(emp);
	}
	
	public static void terminateEmployee(Employee emp) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		employeeDAO.deleteEmployee(emp);
	}
	
	public static void printEmployeeReport(Employee emp, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
		System.out.println(formatter.getFormattedEmployee()); 
	}

}
