package java8_features.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//intermediate operations=> after performing operation on stream, if we will get another stream in output  is called as intermediate opeartion

//1. filter()
//2.map()
//3.stream()
//4.of()
//5.sorted()

//terminal operations => after performing operation on stream, if we will  NOT get stream in output  means if we will get another output except stream that is called as terminal opeartion

//1.collect()
//2.forEach()
//3.count()
//4.toList(),toSet(),toMap()

//filter()=> returns whole object which it has filtered based on given predicate
//map()=>returns specific property from whole object

class Vehical4 {
	int speed;
	String name;
	double price;

	Vehical4(int speed, String name, double price) {
		this.speed = speed;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nVehical4 [speed=" + speed + ", name=" + name + ", price=" + price + "]";
	}

}

public class Map_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Vehical4> l1 = new ArrayList();

		l1.add(new Vehical4(77, "truck", 75000));
		l1.add(new Vehical4(80, "bus", 30000));
		l1.add(new Vehical4(90, "plane", 90000));
		l1.add(new Vehical4(97, "jet", 95000));
		l1.add(new Vehical4(60, "bike", 28000));
		l1.add(new Vehical4(78, "train", 28000));
		l1.add(new Vehical4(91, "plane1", 90000));
		l1.add(new Vehical4(40, "bicycle", 10000));

//		l1.stream().filter((v) -> v.price > 30000).forEach(y -> System.out.println(y));

		// 1.------applying only filter method

//		List<Vehical4> newList = l1.stream().filter((v) -> v.price > 30000).collect(Collectors.toList());
//		System.out.println(newList);

		// OR

		// 2.------applying filter and then map method on stream

//		List<Double> newList = l1.stream().filter((v) -> v.price > 30000).map((v) -> v.price).collect(Collectors.toList());
//		System.out.println(newList);

		// OR

		// 3.------applying map directly on stream without filter() and collecting data
		// in list

//		List<Double> newList = l1.stream().map((v) -> v.price).collect(Collectors.toList());
//		System.out.println(newList);

		// OR

		// 4.------applying map directly on stream without filter() and collecting data
		// into set

		Set<Double> newSet = l1.stream().map((v) -> v.price).collect(Collectors.toSet());
		System.out.println(newSet);

		// Collection => interface
		// Collections => class
		// Collectors =>class

	}

}
