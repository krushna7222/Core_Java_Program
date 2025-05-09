package java8_features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Vehical1 {
	int speed;
	String name;
	double price;

	Vehical1(int speed, String name, double price) {
		this.speed = speed;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nVehical1 [speed=" + speed + ", name=" + name + ", price=" + price + "]";
	}

}

public class With_stream_Api {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Vehical1> l1 = new ArrayList();

		l1.add(new Vehical1(77, "truck", 75000));
		l1.add(new Vehical1(80, "bus", 30000));
		l1.add(new Vehical1(90, "plane", 90000));
		l1.add(new Vehical1(97, "jet", 95000));
		l1.add(new Vehical1(60, "bike", 28000));
		l1.add(new Vehical1(78, "train", 28000));
		l1.add(new Vehical1(91, "plane1", 90000));

		l1.add(new Vehical1(40, "bicycle", 10000));

		// System.out.println(l1);

		// WAP that returns only those object whose price is greater than 30000
		// l1.stream().filter((v)-> v.price > 30000).forEach((h)->
		// System.out.println(h));
		// Or

		// Collection to stream conversion=> stream() method
		// stream to collection(List) conversion => toList()
		// stream to collection(Set) conversion => toSet()
		// stream to collection(Map) conversion => toMap()

		List<Vehical1> l2 = l1.stream().filter((v) -> v.price > 30000).collect(Collectors.toList());
		System.out.println(l2);

		System.out.println();

		Set<Vehical1> s3 = l1.stream().filter((v) -> v.price > 30000).collect(Collectors.toSet());
		System.out.println(s3);

		System.out.println();
		Map<String, Double> map1 = l1.stream().filter((v) -> v.price > 30000)
				.collect(Collectors.toMap(key -> key.name, val -> val.price));
		System.out.println(map1);

		// map()
		Long count = l1.stream().filter((vh) -> vh.price > 30000).count();
		System.out.println("Number of records returned by the filter method = " + count);
	}

}
