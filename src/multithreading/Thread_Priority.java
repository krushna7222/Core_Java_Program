package multithreading;

//multithreading is called as "concurrency execution"

//thread schedular => manages the execution of thread based on some criteria
//1.priority      => Preemptive-priority scheduling
//2. arrival time   =>First come First serve Scheduling(FIFS)
//3.execution time(time slice)    => time-slicing/execution time scheduling  

//the process of allocating execution time to the thread by the CPU is called as "time slicing"

//by default, each java application  consists of at least one thread  i.e main() method/thread...and this main is a parent thread of all the userdefined and built in thread

class F implements Runnable {

	public void run() // implementation of run() method of Runnable interface
	{
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "= " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 2sec => 2000ms
		}

	}
}

public class Thread_Priority {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		F c1 = new F();
		Thread t1 = new Thread(c1); //
		t1.setName("t1");
		// System.out.println("default priority of t1 thread is = "+t1.getPriority());

		// t1.setPriority(13); //Exception => IllegalArgumentException

		// t1.setPriority(Thread.MIN_PRIORITY);
		// t1.setPriority(Thread.NORM_PRIORITY);
		// t1.setPriority(Thread.MAX_PRIORITY);

		// System.out.println("after setting priority, the priority of t1 thread is =
		// "+t1.getPriority());

		F c2 = new F();
		Thread t2 = new Thread(c2);
		t2.setName("t2");

		F c3 = new F();
		Thread t3 = new Thread(c3);
		t3.setName("t3");

		t1.setPriority(6);
		t2.setPriority(10);
		t3.setPriority(1);

		t1.start();
		t2.start();
		t3.start(); // Thread schedular

		// t2=8,0.2,5min t3=8,=0.2,1 hour t1=3
	}

}