package org.encapsulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompanyMap {
	public static void main(String[] args) {
		Map <Integer,EmployeeDetails> map = new HashMap<>();
		EmployeeDetails e1 = new EmployeeDetails();
		e1.setId(4567);
		e1.setName("sridhar");
		e1.setPhoNo(987654);
		e1.setSalary(700087);
		EmployeeDetails e2 = new EmployeeDetails();
		e2.setId(9876567);
		e2.setName("sampath");
		e2.setPhoNo(87656);
		e2.setSalary(100878);
		map.put(101, e1);
		map.put(102, e2);
		Set<Entry<Integer, EmployeeDetails>> l = map.entrySet();
		for (Entry<Integer, EmployeeDetails> g : l) {
			System.out.println(g.getKey()+" emyloyee info");
			System.out.println(g.getValue().getId());
			System.out.println(g.getValue().getName());
			System.out.println(g.getValue().getPhoNo());
			System.out.println(g.getValue().getSalary());
			
		}
		
		
	}

}
