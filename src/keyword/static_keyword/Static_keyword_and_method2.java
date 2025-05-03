package keyword.static_keyword;

class Bank
{
	int acc_number;
	String acc_holder_name;
	static String branch_name="BOI";
	static double rate_of_intrest=7.5;
	
	
	Bank(int acc_number, String acc_holder_name) 
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

public class Static_keyword_and_method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank user1 = new Bank(111213,"Rajesh Patil");
		user1.Display();
		
		Bank.change_interest();
		Bank user2 = new Bank(21223,"Hitesh Raut");
		user2.Display();

	}

}
