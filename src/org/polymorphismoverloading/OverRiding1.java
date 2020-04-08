package org.polymorphismoverloading;

public class OverRiding1 {
	private void savings(int amount) {
      System.out.println("Savings amount is:"+amount);
	}
	private void depositAmountAndName(int amount,String name) {
       System.out.println("Deposit amount and acccounnt holder name"+amount+name);
	}
	private void withdrawAmountAndPhno(int amount,long phno) {
    System.out.println("Withdraw amount and phone number"+amount+phno);
	}
	public static void main(String[] args) {
		OverRiding1 or = new OverRiding1();
		or.savings(23456);
		or.depositAmountAndName(98765, "srhdar");
		or.withdrawAmountAndPhno(9987, 976543210);
		
		
	}

}
