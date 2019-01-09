public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private double sal;

	public Employee(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSal() {
		return sal;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		/*String emp1 = this.getEmpName();
		String emp2 = o.getEmpName();*/
		
		Double d1 = this.getSal();
		Double d2 = o.getSal();
		return -d1.compareTo(d2);
		
		/*int emp1 = this.getEmpId();
		int emp2 = o.getEmpId();
		
		return emp1<emp2?-1:emp1>emp2?1:0;*/
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal="
				+ sal + "]";
	}

}
