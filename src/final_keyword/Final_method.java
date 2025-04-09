package final_keyword;

////2.final method =>the method which is declared as a final connot be override

//Q.how you can create your own immutable method?
//=> by declaring that method as final..

class Animal {
	// final void run()
	// Or
	void run() {
		System.out.println("animal is running Parent.....");
	}
}

class Dog extends Animal {
	void run() {
		// super.run();
		System.out.println("animal is running in Child.....");
	}
}

public class Final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1 = new Dog();
		d1.run();
	}
}
