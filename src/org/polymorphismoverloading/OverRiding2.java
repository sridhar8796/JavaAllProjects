package org.polymorphismoverloading;

public class OverRiding2 extends OverRiding1{
	private void savings(int amount) {
		System.out.println("Savings amount is:"+amount);
	}
	private void depositAmountAndName(int amount,String name) {
		System.out.println("Deposit amount and acccounnt holder name "+amount+" "+name);
	}
	private void withdrawAmountAndPhno(int amount,long phno) {
		System.out.println("Withdraw amount and phone number "+amount+" "+phno);
	}
public static void main(String[] args) {
	OverRiding2 or = new OverRiding2();
	or.savings(5678);
	or.depositAmountAndName(345678, " sampath");
	or.withdrawAmountAndPhno(56734567,456756789);
}




}



