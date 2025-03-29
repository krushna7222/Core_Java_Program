package static_keyword;

class Bank1
{
	int acc_number;
	String acc_holder_name;
	String branch_name;
	static double rate_of_intrest;
	
	{
		branch_name="BOI";
	}
	
	static
	{
		
		rate_of_intrest=7.5;
	}
	
	
	Bank1(int acc_number, String acc_holder_name) 
	{
		this.acc_number = acc_number;
		this.acc_holder_name = acc_holder_name;
	}
	
	void Display()
	{
		System.out.println();
		System.out.println("Account Number Is :- " + acc_number);
		System.out.println("Account Holder Name Is :- " + acc_holder_name);
		System.out.println("Branch Name Is :- " + branch_name);
		System.out.println("Rate Of Interest Is :- " + rate_of_intrest);
	}
	
	static void change_interest()
	{
		rate_of_intrest=7.0;
	}
		
}

public class Bank_static_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank1 user1 = new Bank1(111213,"Rajesh Patil");
		user1.Display();
		
		Bank1.change_interest();
		Bank1 user2 = new Bank1(21223,"Hitesh Raut");
		user2.Display();

	}

}
