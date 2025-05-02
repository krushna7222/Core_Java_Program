package multithreading;

//types of Synchronization
//1. process Synchronization 	Vs 		multiprocess(not in java)
//2. thread Synchronization  	Vs 		multithreading

//1. mutual exclusion(mutex)    =>  	synchronized
//2. inter thread communication/cooperation  => wait(), notify(),notifyAll()

//Synchronization => execution of one thread at a time

//multithreading=> multiprocessing       => multitasking

//race condition => it the process when multiple threads wants to access shared resources at the same time
//the solution of race condition the concept of synchronization

//critical section => it is the the part of code/shared resource on which multiple threads try to gain an access at the same time

class BankApp1 {

	int amt = 5000;

	synchronized void withdraw(int amt) throws InterruptedException {

		System.out.println("You are in Withdraw Opearion--------");
		while (this.amt < amt) {
			System.out.println("Sorry your account ballance is Low you can't withdraw ammout");
			System.out.println(
					"deposite your accout " + (amt - this.amt) + " Rs and more than " + (amt - this.amt) + " Rs");
			wait(); // wait() transfers currently executing thread in the waiting() state
		}
		if (this.amt > amt) {
			System.out.println(amt + " Rs Withdraw succesfully...");
			System.out.println("Your Account Balance Is Rs " + (this.amt - amt));
		}
	}

	synchronized void deposite(int amt) {
		System.out.println("You are in Deposite Opearion--------");

		this.amt = this.amt + amt;
		System.out.println("Your Account Creadited by Rs " + (amt));
		System.out.println("Your Account Balance Is Rs " + this.amt);
		notify(); // notify() is used to awake the SINGLE thread which is waiting state
					// notifyAll() is used to awake the ALL/MULTIPLE threads which is waiting state

	}

}

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankApp1 b1 = new BankApp1();

		Thread t1 = new Thread() {
			public void run() {
				try {
					b1.withdraw(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				try {

					Thread.sleep(2000);
					b1.deposite(1000);

					Thread.sleep(4000);
					b1.deposite(3500);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};

		t1.start();
		t2.start();

	}

}
