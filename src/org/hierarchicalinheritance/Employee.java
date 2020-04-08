package org.hierarchicalinheritance;

public class Employee extends Company {
	public void employeeId() {
		System.out.println("Employee Id is:");

	}
	public void employeeName() {
		System.out.println("Employee name is");

	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.employeeId();
		emp.employeeName();
		emp.CompanyId();
		emp.ComppanyName();
	}

}
