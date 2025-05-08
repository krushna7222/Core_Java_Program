package java8_features.stream_api;

import java.util.ArrayList;
import java.util.List;

class Vehical {
	int speed;
	String name;
	double price;

	Vehical(int speed, String name, double price) {
		this.speed = speed;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehical [speed=" + speed + ", name=" + name + ", price=" + price + "]";
	}

}

public class Without_stream_Api {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Vehical> l1 = new ArrayList();

		l1.add(new Vehical(77, "truck", 75000));
		l1.add(new Vehical(80, "bus", 30000));
		l1.add(new Vehical(60, "bike", 28000));
		l1.add(new Vehical(78, "train", 28000));
		l1.add(new Vehical(90, "plane", 90000));
		l1.add(new Vehical(40, "bicycle", 10000));

		// System.out.println(l1);

		List<Vehical> l2 = new ArrayList();

		// WAP that returns only those object whose price is greater than 30000
		for (Vehical v : l1) {
			if (v.price > 30000) {
				l2.add(v);
			}
		}

		System.out.println(l2);

	}

}