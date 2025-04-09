package Class_and_Object;

class Box {
	int length;
	int height;
	int breadth;

	Box(int length, int height, int breadth) {
		this.length = length;
		this.height = height;
		this.breadth = breadth;

		displayVolume();
	}

	void displayVolume() {
		double volume = length * breadth * height;
		System.out.println("Volume of the box is: " + volume);
	}

}

public class Display_volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1 = new Box(7, 8, 9);

	}

}
