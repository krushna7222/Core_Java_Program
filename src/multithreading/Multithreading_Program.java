package multithreading;

class C implements Runnable {

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

public class Multithreading_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1 = new C();
		Thread t1 = new Thread(c1);
		t1.setName("t1");
		t1.start();

		C c2 = new C();
		Thread t2 = new Thread(c2);
		t2.setName("t2");
		t2.start();

		C c3 = new C();
		Thread t3 = new Thread(c3);
		t3.setName("t3");
		t3.start();

	}

}
