package pack1;

public class ThreadDemo extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(
					Thread.currentThread().getName() + ": " + i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// logic-1
		ThreadDemo obj = new ThreadDemo();
		obj.setName("MyThread");
		obj.start();

		// logic-2

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}

	}

}
