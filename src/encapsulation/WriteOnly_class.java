package encapsulation;

//Q.how we can create our own write only class
//WriteOnly => we can only write/modify data but cannot read
//If we want to create our own WriteOnly class then just provide setter in that class.
//do not provide any getter


class Login2
{
	private String uname="hello@123";
	
	void setUname(String uname)
	{
		this.uname=uname;
	}
}

public class WriteOnly_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login2 l2 = new Login2();
		l2.setUname("Krushna@123");
		 
        //   System.out.println(l1.getUname();  //error => getter "getUname()" does not exists
		
	

	}

}
