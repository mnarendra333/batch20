package pack1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student obj1 = new Student(101, "Sree", 600);
		System.out.println(obj1.getId()+" "+obj1.getName()+" "+obj1.getMarks());
		
		
		Employee obj2 = new Employee(102, "James", 50000);
		System.out.println(obj2.getId()+" "+obj2.getName()+" "+(int)obj2.getSal());

	}

}
