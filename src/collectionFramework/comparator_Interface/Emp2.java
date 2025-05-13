package collectionFramework.comparator_Interface;

public class Emp2 {
	private int id;
	private String name;
	private int sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Emp2(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}
