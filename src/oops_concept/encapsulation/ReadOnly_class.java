package oops_concept.encapsulation;

//Q.how we can create our own read only class
//ReadOnly => we can only read data but cannot write/modify
//If we want to create our own ReadOnly class then just provide getters in that class.
//do not provide any setter


class Login1
{
	private String uname="krushna@7222";
	
	String getUname()
	{
		return uname;
	}
}

public class ReadOnly_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login1 l1 = new Login1();
		 // l1.uname="harsh";  //error=> because, uname is private
        //   l1.setUname("harsh");  //error => setter "setUname()" does not exists
		
		System.out.println(l1.getUname());

	}

}
