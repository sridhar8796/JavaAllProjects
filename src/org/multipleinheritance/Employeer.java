package org.multipleinheritance;

public class Employeer implements Company1,Company2 {

	@Override
	public void comapny2Name() {
		System.out.println("Company name is:");
		
	}

	@Override
	public void company2Id() {
         System.out.println("company2Id");		
	}

	@Override
	public void company1Id() {
		System.out.println("company1Id");
		
	}

	@Override
	public void company1Name() {
		System.out.println("Company Name");
		
	}

	@Override
	public void companylogo() {
		System.out.println("Company logo");
		
	}
	public static void main(String[] args) {
		Employeer empr = new Employeer();
		empr.comapny2Name();
		empr.company1Id();
		empr.company1Name();
		empr.company2Id();
		empr.companylogo();
	}
	

}
