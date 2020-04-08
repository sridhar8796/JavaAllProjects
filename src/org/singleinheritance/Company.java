package org.singleinheritance;

public class Company extends Employee {
	private void companyId() {
		System.out.println("Company ID is");

	}
	private void companyName() {
        System.out.println("Company Name is:");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.employeeId();
		c.employeeName();
		c.companyId();
		c.companyName();
	}

}
