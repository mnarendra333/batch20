import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList obj = new ArrayList();
		
		for (int i = 10; i <=200; i+=10) {
			obj.add(i);
		}
		
		System.out.println(obj);
		
		///obj.clear();
		//if(obj.size()>0 && obj.contains(190))
		obj.remove(new Integer(190));
		System.out.println(obj);
		
		
		System.out.println(obj.indexOf(200));
		
		
		obj.set(2, 99);
		System.out.println(obj);
		
		
		
		obj.add(200);
		System.out.println(obj);
		
		/*
		Object obj1[] = {10,20,30,40,50};
		obj1[1] = 99;
		for (Object object : obj1) {
			System.out.println(object);
		}*/
		
		
		

	}

}
