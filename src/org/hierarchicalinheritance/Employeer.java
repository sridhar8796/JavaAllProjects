package org.hierarchicalinheritance;

public class Employeer extends Company {
	public void employeerId() {
		System.out.println("Employeer Id is:");
	}
	public void employeerName() {
		System.out.println("Employee Name is");
	}
	public static void main(String[] args) {
		Employeer emp = new Employeer();
		emp.CompanyId();
		emp.ComppanyName();
		emp.employeerName();
		emp.employeerId();
		
	}


}
