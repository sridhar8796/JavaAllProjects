package org.multilevelinheritance;

public class Company extends Employeer {
	private void companyName() {
		System.out.println("Company Name is:");

	}
	private void companyId() {
       System.out.println("Company Id is: ");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.companyId();
		c.companyName();
		c.employeerId();
		c.employeerName();
		c.employeeId();
        c.employeeName();
	}

}
