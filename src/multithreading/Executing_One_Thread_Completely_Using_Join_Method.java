package multithreading;

class D implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "=" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

public class Executing_One_Thread_Completely_Using_Join_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		D d1 = new D();
		Thread t1 = new Thread(d1);
		t1.setName("t1");
		t1.start();
		t1.join(); // join() method is allow to execute one thread completely and after this thread
					// start next thread
		System.out.println("Execution Of t1 Thread is Completed...");

		D d2 = new D();
		Thread t2 = new Thread(d2);
		t2.setName("t2");
		t2.start();
		t2.join();
		System.out.println("Execution Of t1 Thread is Completed...");

		D d3 = new D();
		Thread t3 = new Thread(d3);
		t3.setName("t3");
		t3.start();
		t3.join();
		System.out.println("Execution Of t1 Thread is Completed...");
	}

}
