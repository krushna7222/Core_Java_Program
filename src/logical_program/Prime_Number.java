package logical_program;

import java.util.Scanner;

//Q.What is prime number?
//the number which is divisible 1 or itself...means the number which is having exactly 2 factors  is called as prime no....

//Q. 1 is prime no or not?
//=> is non prime number because 1 is having only one factor

//itself or 1

//prime
//7 % 1  = 0
//7 % 2 =  1
//7 % 3 =  1
//7 % 4 =  3
//7 % 5 =  2
//7 % 6 =  1
//7 % 7 =  0

//non-prime
//8 % 1=0
//8 % 2=0
//8 % 3= 2
//8 % 4= 0
//8 % 5= 3
//8 % 6=2
//8 % 7=1
//8 % 8= 0

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(n + " Is Prime Number.");
		} else {
			System.out.println(n + " Is Not-Prime Number.");
		}

	}

}
