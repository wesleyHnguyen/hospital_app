package reporting;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
	
	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
		// TODO Auto-generated constructor stub
	}

	private Employee anEmployee;
//	private FormatType formatType;
	
	public String getFormattedEmployee() {
		return getFormattedValue();
	}

}
