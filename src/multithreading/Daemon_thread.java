package multithreading;

//types of threads
//1.userdefined thread
//2.daemon thread(low priority)  => i.used to perform garbage collection activity
//ii.used to provide services to the userdefined thread

//garbage collection => finalize() => daemon thread

class H implements Runnable {

	public void run() // implementation of run() method of Runnable interface
	{
		for (int i = 0; i < 6; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 2sec => 2000ms
		}

	}
}

public class Daemon_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		H b1 = new H(); // here,b1 is NOT thread object because B is not thread class because we have
						// not extended Thread class in B class....so, we have to converting b1 object
						// into thread class object by passing that objetc as a parameter to the
						// paramerized constructor of Thread class

		// converting b1 object into thread class object
		Thread t1 = new Thread(b1);

		System.out.println("before setDaemon,Is t1 is Daemon? = " + t1.isDaemon()); // false , isDaemon() => chekcs
																					// whether currently executing
																					// thread is daemon or not

		t1.setDaemon(true); // setDaemon(true) converts userdefined thread into daemon thread
		System.out.println("after converting t1 into the daemon thread, Is t1 is Daemon? =" + t1.isDaemon());
		t1.start(); // this start() will automatically called run() method internally

	}

}
