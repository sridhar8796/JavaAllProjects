package org.encapsulation;
import java.util.HashSet;
import java.util.Set;

public class CompanySet {
	public static void main(String[] args) {
	Set<EmployeeDetails> s = new HashSet<EmployeeDetails>();
	EmployeeDetails e1 = new EmployeeDetails();
    e1.setId(134134);
    e1.setName("sridhar");
    e1.setPhoNo(987654312);
    e1.setSalary(98765654);
    EmployeeDetails e2 = new EmployeeDetails();
    e2.setId(12345);
    e2.setName("sampath");
    e2.setPhoNo(123456789);
    e2.setSalary(98765);
    s.add(e1);
    s.add(e2);
    for (EmployeeDetails x:s) {
    	System.out.println(x.getId());
    	System.out.println(x.getName());
    	System.out.println(x.getPhoNo());
    	System.out.println(x.getSalary());
    
    	
		
	}

}
}
