package employee;

import java.util.List;


public class Employee {

private int empId;
private String empName;
private String empEmail;
private List<String> empPhoneNumbers;

public Employee(int empId, String empName, String empEmail, List<String> empPhoneNumbers) {
	this.empId = empId;
	this.empName = empName;
	this.empEmail = empEmail;
	this.empPhoneNumbers = empPhoneNumbers;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpEmail() {
	return empEmail;
}

public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}

public List<String> getEmpPhoneNumbers() {
	return empPhoneNumbers;
}

public void setEmpPhoneNumbers(List<String> empPhoneNumbers) {
	this.empPhoneNumbers = empPhoneNumbers;
}

@Override
public String toString() {
	return "Employee{" +
			       "empId=" + empId +
			       ", empName='" + empName + '\'' +
			       ", empEmail='" + empEmail + '\'' +
			       ", empPhoneNumbers=" + empPhoneNumbers +
			       '}';
}
}
