
public class Student implements Cloneable{

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Student s1 = new Student(101,"Ravi");
		System.out.println(s1);
		
		Student s2 = new Student(101,"Ravi");
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		System.out.println(s1.getClass().getName());
		
		
		Student s3 = (Student)s1.clone();
		System.out.println(s1.hashCode()+" "+s3.hashCode());
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		
	}

}
