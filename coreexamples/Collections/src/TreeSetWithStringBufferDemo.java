import java.util.TreeSet;


public class TreeSetWithStringBufferDemo {
	
	
	public static void main(String[] args) {
		
		
		TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>();
		ts.add(new StringBuffer("hello"));
		ts.add(new StringBuffer("anil"));
		ts.add(new StringBuffer("hi"));
		
		System.out.println(ts);
	// java.lang.ClassCastException: 
		//java.lang.StringBuffer cannot be cast to java.lang.Comparable	
		
		
		
	}

}
