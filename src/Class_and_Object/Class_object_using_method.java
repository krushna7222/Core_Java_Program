package Class_and_Object;

class User
{
	String name;
	int age;
	String email;
	
	void accept(String n,int a,String em) {
		name=n;
		age=a;
		email=em;
		
	}
	
	void display() {
		System.out.println("-----User Data-----");
		System.out.println("Name Is :- "+ name);
		System.out.println("age Is :- "+ age);
		System.out.println("email Is :- "+ email);
	}
	
	
}

public class Class_object_using_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User neha = new User();
		
		neha.accept("neha",20,"neha@gmail.com");
		neha.display();
		
		User raj = new User();
		raj.accept("raj bhoir",24,"rajbhoir@gmail.com");
		raj.display();

	}

}
