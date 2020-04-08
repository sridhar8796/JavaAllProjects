package org.userdefinedexception;

public class EmployeeNotFoundException extends Exception {
	@Override
	public String getMessage() {
		String msg = "Employee not found in unit 1";
		return msg;
	}

}

