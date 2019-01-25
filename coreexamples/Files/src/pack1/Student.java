package pack1;

import java.io.Serializable;

public class Student implements Serializable{

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks
				+ "]";
	}

	private int id;
	private String name;
	private int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

}
