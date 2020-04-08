package org.singleinheritance;

public class Employee {
	public void employeeId() {
		System.out.println("Employee ID :12345");
	}
     public void employeeName() {
        System.out.println("Employee Name:sridhar");
	}
     public static void main(String[] args) {
    	 Employee s = new Employee();
		s.employeeId();
		s.employeeName();
	}
     
}
