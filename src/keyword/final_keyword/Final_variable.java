package keyword.final_keyword;

//final =>final keyword is used to declare variable,method,and class  as a final

//1.final variable =>the variable which is declared as a final can NOT be changed  and its
//value remains fixed throughout the program.

class Area {
	double x;
	final double pi = 3.14; // variable, const/final(fixed)
	int r = 7;

	void areaOfCircle() {

		// pi=6.7; //error=> //error=->bcz pi is final so we cannot change the value of
		// it
		System.out.println("area of circle = " + (pi * r * r));
	}
}

public class Final_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area a1 = new Area();
		a1.areaOfCircle();
	}

}