package week3.day1Assignment;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Rs.20,000 is deposited in your account");
	}

	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.saving();
		a.fixed();
		BankInfo b=new BankInfo();
		b.deposit();
		a.deposit();

	}

}
