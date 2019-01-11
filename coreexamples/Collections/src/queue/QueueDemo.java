package queue;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 1; i <=11; i++) {
			queue.offer(i);
		}
		System.out.println(queue);
		
		
		//System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);

	}

}
