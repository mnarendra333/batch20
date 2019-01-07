import java.util.Vector;


public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 10; i <=100; i=i+10) {
			vector.add(i);
		}
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		vector.add(110);
		System.out.println(vector);
		System.out.println(vector.size());
		System.out.println(vector.capacity());

	}

}
