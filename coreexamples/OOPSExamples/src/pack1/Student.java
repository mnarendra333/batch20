package pack1;

public class Student {

	private int stuId;
	private String stuName;
	private String addr;

	public Student(int stuId, String stuName, String addr) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.addr = addr;
	}
	 
	@Override
	public String toString() {
		return stuId+" "+stuName+" "+addr;
	}
	
	public static void main(String[] args) {
		Student obj = new Student(101, "Ram", "bangl");
		System.out.println(obj);
	}
}
