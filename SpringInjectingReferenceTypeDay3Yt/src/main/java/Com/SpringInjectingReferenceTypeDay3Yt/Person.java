package Com.SpringInjectingReferenceTypeDay3Yt;

public class Person {

	private String name;
	Student st;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Student st) {
		super();
		this.name = name;
		this.st = st;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", \nst=" + st + "]";
	}

}
