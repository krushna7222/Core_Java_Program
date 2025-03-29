package encapsulation;

class Student
{
	private int std_id;
	private String email;
	private String password;
	
	void setStdId(int std_id)
	{
		this.std_id=std_id;
	}
	void setemail(String email)
	{
		this.email=email;
	}
	void setpassword(String password)
	{
		this.password=password;
	}
	
	int getStdId()
	{
		return std_id;
	}
	String getemail()
	{
		return email;
	}
	String getpassword()
	{
		return password;
	}
}

public class Encapsulation_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
		s1.setStdId(101);
		s1.setemail("krushna@gmail.com");
		s1.setpassword("krushna7222");
		
		System.out.println(s1.getStdId());
		System.out.println(s1.getemail());
		System.out.println(s1.getpassword());

	}

}
