package pack1;

public class Student extends Person {

	private int marks;
	private Address address;

	public Student(int id, String name, int marks, Address address) {
		super(id, name);
		this.marks = marks;
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}
	
	
	public Address getAddress(){
		return address;
	}

}
