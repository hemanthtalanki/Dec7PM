package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("custmer deposit amount is 1500");
		
	
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
		a.saving();
		a.fixed();
		a.add(10, 20);
		}
	public void add(int a,int b) {
		int sum=a+b;
		
		System.out.println(sum);
		

	}
	public void sub(int a, int b) {
		int sub =a-b;
		System.out.println(sub);

	}

}
