package multithreading;

//thread is a sub program/sub process which runs in the background of main process
//multithreading means multiple threads will get execute at the same time

//with the help of multithreading we can achieve multi-processing
//and with the help of  multi-processing we can achieve multitasking

//multithreading  => multi-processing=> multitasking

//there are 2 ways to create a thread
//1.by extending Thread class   //java.lang

//2.by implementing Runnable interface(most widely used way to create a thread this way can create a thread in case of normal program and also in case of inheritance program)

//types of interface
//1.Marker 
//2.Single abstract method/functional
/*
//Thread=> sub program or sub process which runs in the background of main process
//process? => 


//Execution of multiple threads at a time is called as multithreading

//One process consists of multiple threads... ssnsh, priya


//Thread => program
//thread lifecycle => new, runnable, running, non-runnable,terminate
/*
multithreading(multiple threads execution at a time),
Synchronization(only one thread execution at a time)
*/

//

class A extends Thread {
	@Override
	public void run() // overridden run() method of Thread class
	{
		int a[] = { 5, 3, 2, 1, 3, 4, 3, 23, 43, 99 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] * 2);
			try {
				Thread.sleep(2000); // 2sec => 2000ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class Creating_thread_by_Extending_Thread_Class {

	public static void main(String[] args) {
		A a1 = new A();
		a1.start(); // this start() will automatically called run() method internally

	}
}
