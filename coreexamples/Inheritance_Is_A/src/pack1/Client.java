package pack1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create the object for Address

		Address stuAddr = new Address("JpNagar", "bangl", "India", 560037);
		Address empAddr = new Address("Megestic", "bangl", "India", 560038);

		Student obj1 = new Student(101, "Sree", 600, stuAddr);
		System.out.println(obj1.getId() + " " + obj1.getName() + " "
				+ obj1.getMarks());

		System.out.println(obj1.getAddress().getCityName());
		System.out.println(obj1.getAddress().getStreetName());
		System.out.println(obj1.getAddress().getCountryName());
		System.out.println(obj1.getAddress().getPinCode());

		Employee obj2 = new Employee(102, "James", 50000, empAddr);
		System.out.println(obj2.getId() + " " + obj2.getName() + " "
				+ (int) obj2.getSal());

		System.out.println(obj2.getAddress().getCityName());
		System.out.println(obj2.getAddress().getStreetName());
		System.out.println(obj2.getAddress().getCountryName());
		System.out.println(obj2.getAddress().getPinCode());

	}
}
