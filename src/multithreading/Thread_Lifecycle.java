package multithreading;

//Thread Life-cycle
//1. New State
//2. Runnable State
//------//3.Run State => this is not actual state this state fore understand
//4. non-Runnable
//5.Terminated

class E implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {
			System.out.println(i);
			try {

				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

public class Thread_Lifecycle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		E e1 = new E();

		Thread t1 = new Thread(e1);

		System.out.println("After creating an object of thread class but before calling start() method thread state = "
				+ t1.getState());

		t1.start();
		System.out.println("After calling start() method thread state = " + t1.getState());

		t1.join();
		System.out.println("After completing execution of thread thread state = " + t1.getState());

	}

}
