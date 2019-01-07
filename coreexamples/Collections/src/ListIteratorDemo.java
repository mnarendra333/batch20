import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("Three");
		al.add("four");
		al.add("five");
		al.add("seven");
		
		
		System.out.println(al);
		
		
		ListIterator<String> litr = al.listIterator();
		System.out.println("============forward direction================");
		
		
		while(litr.hasNext()){
			
			
			String data = litr.next();
			System.out.println(data);
			/*if(data.equals("one"))
				litr.add("Two");
			
			if(data.equals("seven"))
				litr.remove();
			
			if(data.equals("four"))
				litr.set("4");*/
		}
		System.out.println("===========backword direction===============");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		
		System.out.println(al);
		
		
		
		

	}

}
