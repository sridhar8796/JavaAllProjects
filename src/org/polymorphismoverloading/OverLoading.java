package org.polymorphismoverloading;

public class OverLoading {
	public void employee() {
		System.out.println("Default Method Without Parameters passed");
	}
	public void employee(int id) {
		System.out.println("Employee Id is:"+id);
	}
	public void employee(String name,int id) {
		System.out.println("Employee Name and Id is:"+name+id);

	}
	public void employee(String name,int id,long phno) {
		System.out.println("Employee Phone number,name and Id:"+name+id+phno);

	}
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.employee();
		ol.employee(1234567);
		ol.employee("sridhar",12345678);
		ol.employee("sridhar",2345678, 987654321);

	}
}

