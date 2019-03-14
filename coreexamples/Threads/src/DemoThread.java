
public class DemoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t = new Thread("MyThread");
		System.out.println(t.getName());
		
		t.setName("MyThread-1");
		System.out.println(t.getName());
		
		
		System.out.println(t.getPriority());
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());
		
		
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());
		t.stop();
		System.out.println(t.isAlive());
		
		
	}

}
