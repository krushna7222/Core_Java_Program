package oops_concept.inheritance;

class College
{
	String clg_name;
	String city;
	
	public College(String clg_name, String city) {
		this.clg_name = clg_name;
		this.city = city;
	}
	
	
}

class Library extends College
{
	int floor;
	int rooms;
	
	public Library(String clg_name, String city,int floor, int rooms) {
		super(clg_name, city);
		this.floor = floor;
		this.rooms = rooms;
	}
	
	
}

class Book extends Library
{
	int no_of_copies;
	String subject;
	
	Book(String clg_name,String city,int floor,int rooms,int no_of_copies,String subject)
	{
		super(clg_name,city,floor, rooms);
//		this.floor = floor;
//		this.rooms = rooms;
		this.no_of_copies = no_of_copies;
		this.subject = subject;
	}
	
	void display()
	{
		System.out.println("Name Of College :- "+clg_name);
		System.out.println("Name Of City :- "+city);
		System.out.println("Library on which Floor :- "+floor);
		System.out.println("No of rooms in Library :- "+rooms);
		System.out.println("Books copies  :- "+no_of_copies);
		System.out.println("Book Subject :- "+subject);
		
	}
	
}

public class Multilevel_inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book("KTHM College", "Nashik",1 , 6, 26, "Adv Java");
		b1.display();

	}

}
