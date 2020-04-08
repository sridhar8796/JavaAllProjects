package org.userdefinedexception;

public class Company {
  private void search() {
	String id = "12345";
	if (id.contains("89")) {
		System.out.println("Employee id is found");
		
	}
	else {
		try {
			throw new EmployeeNotFoundException ();
		} catch (EmployeeNotFoundException e1) {
			e1.printStackTrace();
			
		}
	}
}
	
}
