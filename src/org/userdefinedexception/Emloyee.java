package org.userdefinedexception;

import java.io.IOException;

public class Emloyee {
	public static void main(String[] args) throws EmployeeNotFoundException,IOException{
		throw new EmployeeNotFoundException();
		
	}

}
