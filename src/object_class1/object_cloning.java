package object_class1;

class Emp implements Cloneable {

	int eid;
	String emp_name;
	double salary;

	public Emp(int eid, String emp_name, double salary) {
		super();
		this.eid = eid;
		this.emp_name = emp_name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class object_cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Emp e1 = new Emp(101, "Rohit", 7452652.42);

		System.out.println("e1 = " + e1);
		System.out.println("hashcode = "+e1.hashCode());

		Emp e2 = (Emp) e1.clone();
		System.out.println("e2 = " + e2);
		System.out.println("hashcode = "+e2.hashCode());

		Emp e3 = (Emp) e2.clone();
		System.out.println("e3 = " + e3);
		System.out.println("hashcode = "+e3.hashCode());

	}

}
