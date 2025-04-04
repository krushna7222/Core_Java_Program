package interfaces_program;

interface Bank {
	// by default , variable sin interface are public static final/...
	// public static final int amt=3000; //static(common)=> changeable,
	// const/final(fixed)=> non changeable

	public abstract void withdraw(int amt);

	public abstract void deposite(int amt);

}

class Transaction implements Bank {
	private int amt = 3000;

	public void withdraw(int amt) {
		if (this.amt > amt) {
			this.amt = this.amt - amt;
			System.out.println();
			System.out.println("Your Account Balance Is Debited By :- " + amt);
			System.out.println("Current Account Balance Is  :- " + this.amt);
		} else {
			System.out.println();
			System.out.println("Your Account Balance Is LOW");
			System.out.println("Current Account Balance Is  :- " + this.amt);
		}
	}

	public void deposite(int amt) {
		this.amt = this.amt + amt;
		System.out.println();
		System.out.println("Congratulation Your Account Balance Credited By :- " + amt);
		System.out.println("Current Account Balance Is  :- " + this.amt);
	}
}

public class Variables_inside_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transaction t1 = new Transaction();
		t1.deposite(2650);
		t1.withdraw(1700);
		t1.withdraw(1230);
	}

}
