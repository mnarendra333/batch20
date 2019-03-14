package pack1;

public class ThreadDemo2 implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			System.out.println(
					Thread.currentThread().getName() + ": " + i);
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadDemo2 obj = new ThreadDemo2();
		Thread t = new Thread(obj);
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println(
					Thread.currentThread().getName() + ": " + i);
		}


	}


}
