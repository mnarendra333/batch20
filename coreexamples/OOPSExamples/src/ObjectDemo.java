
public class ObjectDemo implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ObjectDemo obj1  = new ObjectDemo();
		System.out.println(obj1.toString());
		
		ObjectDemo obj2  = new ObjectDemo();
		System.out.println(obj1.hashCode()+" "+obj2.hashCode());
		
		System.out.println(obj1.getClass().getName());
		
		try {
			Object obj3 = obj1.clone();
			System.out.println(obj1.hashCode()+" "+obj3.hashCode());
			ObjectDemo od = (ObjectDemo)obj3;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
