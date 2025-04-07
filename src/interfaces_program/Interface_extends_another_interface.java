package interfaces_program;

//class to class =>  extends
//interface to class => implements
//interface to interface => extends

//multilevel
interface Test1 {
	void m1();
}

interface Test2 extends Test1 {
	void m2();

}

class TestImpl implements Test2 {

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

}

public class Interface_extends_another_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}