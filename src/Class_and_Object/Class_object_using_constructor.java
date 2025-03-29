package Class_and_Object;


class Laptop1
{
	int lapid;
	String company;
	String color;
	
	Laptop1(int lid,String comp,String col){
	lapid=lid;
	company=comp;
	color=col;
	
}
	
	
	void printValues() {
		System.out.println("-----Laptop Info-----");
		System.out.println("Laptop ID Is :- "+ lapid);
		System.out.println("Laptop Company Is :- "+ company);
		System.out.println("Laptop Color Is :- "+ color);
	}
}


public class Class_object_using_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop1 lap1 = new Laptop1(101,"hp", "silver");
				lap1.printValues();

	}

}
