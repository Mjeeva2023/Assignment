package assignment1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Cash Deposit");
	}
	public static void main(String[]args) {
		AxisBank bd=new AxisBank();
		bd.deposit();
		bd.saving();
		bd.fixed();
		
	}

}

