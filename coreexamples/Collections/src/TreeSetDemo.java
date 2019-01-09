import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add("Ten");
		System.out.println(ts);
		// java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	}

}
