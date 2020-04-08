package org.abstraction;

public class Company extends AbstractionClass{

	@Override
	void employee() {
		System.out.println("employee name is :");
		
	}

	@Override
	void company() {
		System.out.println("company name is ");
		
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.employee();
		c.company();
		c.employeer();
	}

}
