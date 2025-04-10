package oops_concept.inheritance;

interface DeptComp
{
	void findingBugs();
	void writtingCode();
	
}

interface DeptElc
{
	void designPLC();
}

interface DeptMechanical
{
	void designTools();
}

class Student1 implements DeptComp,DeptElc,DeptMechanical
{
	public void findingBugs()
	{
		System.out.println("Students Finding Bugs in Computer Programming...");
	}
	public void writtingCode()
	{
		System.out.println("StudentsWritting Code in Computer...");
	}
	public void designPLC()
	{
		System.out.println("Students Design PLC in Electric...");
	}
	public void designTools()
	{
		System.out.println("Students Design Tool in Mechanical...");
	}
	
}

public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		s1.findingBugs();
		s1.writtingCode();
		s1.designPLC();
		s1.designTools();

	}

}
