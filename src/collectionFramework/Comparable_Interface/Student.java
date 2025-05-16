package collectionFramework.Comparable_Interface;

//Comparable  and Comparator  are used to perform customizable sorting of an objects present inside collection

//because, the default sort() method that we have in Collections class(like Collections.sort(l1)) perform sorting in ascending order only whcih is we called as "natural order sorting" so if we wants  to perform sorting based different properties of an objetc then we  can use either Comparable or Comaprator interface 

//functional interfaces=> having only one abstract method
//Comparable   => e.g  compareTo(Object o)
//Comparator  =>  e,g  compare(Object o1, Object o2)

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String phoneNo;

	public Student(int id, String name, String phoneNo) {
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student\n [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}

	@Override
	public int compareTo(Student o) {
		// return this.id-o.id; //ascending sorting //sorting based on id
		// return o.id-this.id; //descending sorting //sorting based on id
		return this.name.compareTo(o.name); // sorting based on name
	}

}