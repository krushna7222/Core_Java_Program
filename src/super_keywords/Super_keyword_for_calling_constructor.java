package super_keywords;

class Animal
{
	int age;
	String color;
	
	Animal(int age,String color)
	{
		this.age=age;
		this.color=color;
	}
}

class Dog extends Animal
{
	String type;
	
	Dog(int age, String color, String type)
	{
		super(age,color);
		this.type=type;
	}
	
	void show()
	{
		System.out.println("age  ="+ age);
		System.out.println("color  ="+ color);
		System.out.println("type  ="+ type);
	}
}

public class Super_keyword_for_calling_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog(7,"brown","Pet");
		d1.show();

	}

}
