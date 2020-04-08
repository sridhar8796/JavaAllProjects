package org.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class CompanyList {
	public static void main(String[] args) {
		List <EmployeeDetails> l = new ArrayList<>(); 
		EmployeeDetails e1 = new EmployeeDetails();
		e1.setId(1234567);
		e1.setName("sridhar");
		e1.setPhoNo(987654320);
		e1.setSalary(666666);
		EmployeeDetails e2 = new EmployeeDetails();
		e2.setId(9876);
		e2.setName("sridharsri");
		e2.setPhoNo(987654345);
		e2.setSalary(9876567);
		l.add(e1);
		l.add(e2);
		
		/*for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getPhoNo());
			System.out.println(l.get(i).getSalary());
			
		}*/
		
		for (EmployeeDetails x : l) {
			System.out.println(e1.getId());
			System.out.println(e1.getName());
			System.out.println(e1.getPhoNo());
			System.out.println(e1.getSalary());
			System.out.println(e2.getId());
			System.out.println(e2.getName());
			System.out.println(e2.getPhoNo());
			System.out.println(e2.getSalary());
		
			
		}
		
		
	}

}
