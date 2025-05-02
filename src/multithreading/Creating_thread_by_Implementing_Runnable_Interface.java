package multithreading;

class B implements Runnable {

	@Override
	public void run() {
		int a[] = { 2, 5, 4, 5, 45, 78, 25, 25 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] * 3);
			try {

				Thread.sleep(2500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

public class Creating_thread_by_Implementing_Runnable_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B(); // b1 is not Thread object this is simple object

		Thread t1 = new Thread(b1); // creating the thread object of b1 object using Thread class

		t1.start();

	}

}
