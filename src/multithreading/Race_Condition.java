package multithreading;

//types of Synchronization
//1. process Synchronization  vs   multiprocess (not in java)  
//2. thread Synchronization   vs   multithreading

//Synchrinization => Synchronization is java is the capability to control the access of multiple threads to any shared resource
class BankApp {

	int amt = 5000, w_amt;

	void withdraw(int amt) {
		w_amt = amt;
		System.out.println("You are in Withdraw Opearion--------");
		if (this.amt < amt) {
			System.out.println("Sorry your account ballance is Low you can't withdraw ammout");
			System.out.println(
					"deposite ypur accout " + (this.amt - amt) + " Rs and more than " + (this.amt - amt) + " Rs");
		}
		if (this.amt > amt) {
			System.out.println(amt + " Rs Withdraw succesfully...");
			System.out.println("Your Account Balance Is Rs " + (this.amt - amt));
		}
	}

	void deposite(int amt) {
		System.out.println("You are in Deposite Opearion--------");
		if (w_amt > this.amt) {
			this.amt = this.amt + amt;
			System.out.println("Your Account Creadited by Rs " + (amt));
			System.out.println("Your Account Balance Is Rs " + this.amt);
		}
	}

}

public class Race_Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankApp b1 = new BankApp();

		Thread t1 = new Thread() {
			public void run() {
				b1.withdraw(6000);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				b1.deposite(3500);
			}
		};

		t1.start();
		t2.start();

	}

}
