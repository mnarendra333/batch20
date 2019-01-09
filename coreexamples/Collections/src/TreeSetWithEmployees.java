import java.util.TreeSet;


public class TreeSetWithEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(new Employee(500, "john", 50000));
		ts.add(new Employee(456, "miller", 87000));
		ts.add(new Employee(254, "ken", 90000));
		ts.add(new Employee(127, "richrds", 68000));
		ts.add(new Employee(300, "peterson", 90000));
		
		
		System.out.println(ts);
		

	}

}
