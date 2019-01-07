import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(20);
		ll.add(30);
		ll.add(40);

		System.out.println(ll);

		// add First
		
		ll.addFirst(100);
		System.out.println(ll);
		
		//add at last elemnt
		
		ll.addLast(600);
		System.out.println(ll);
		
		
		ll.add(3, 35);
		System.out.println(ll);
		
		ll.pollFirst();
		System.out.println(ll);

	}

}
