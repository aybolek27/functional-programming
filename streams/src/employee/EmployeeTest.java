package employee;

import java.util.List;

public class EmployeeTest {

public static void main(String[] args) {
	
	//Print all emails - One employee has one email - One to One
	System.out.println("**************************************");
	Employeedata.readlAll()
			.map(Employee::getEmpEmail)
			.forEach(System.out::println);
	
	//Print all phone numbers
	System.out.println("**************************************");
	Employeedata.readlAll()
			.map(Employee::getEmpPhoneNumbers)
			.forEach(System.out::println);

	//getting phone numbers with flatmap
	System.out.println("**************************************");
	Employeedata.readlAll()
			.flatMap(employee -> employee.getEmpPhoneNumbers().stream())
			.forEach(System.out::println);
	
	//More clean way of the code with flatMap
	System.out.println("**************************************");
	Employeedata.readlAll()
			.map(employee -> employee.getEmpPhoneNumbers())
			.flatMap(List::stream)
			.forEach(System.out::println);
	
	
	
	
	
}
}
