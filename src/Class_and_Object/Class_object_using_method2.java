package Class_and_Object;

class Laptop
{
	int lapid;
	String company;
	String color;
	
//Laptop(int lid,String comp,String col){
//	lapid=lid;
//	company=comp;
//	color=col;
//	
//}
	
	void getValues(int lid,String comp,String col) {
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

public class Class_object_using_method2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop lap1 = new Laptop();
		
		lap1.getValues(101,"hp", "silver");
		lap1.printValues();
		
		

	}

}
