import java.util.Comparator;
import java.util.TreeSet;

public class MapWithBusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Bus> ts = new TreeSet<Bus>(new MyComparator());

		ts.add(new Bus(101, "parbeen travels", "Ac", 750));
		ts.add(new Bus(102, "jabar travels", "Non Ac", 620));
		ts.add(new Bus(103, "sultan travels", "Non Ac", 550));
		ts.add(new Bus(104, "srm travels", "Ac", 920));
		ts.add(new Bus(105, "national travels", "Ac", 854));
		ts.add(new Bus(106, "arun travels", "Ac", 750));

		System.out.println(ts);

	}
}

class MyComparator implements Comparator<Bus> {

	@Override
	public int compare(Bus o1, Bus o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}
