
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			for (int i = 1; i <=5; i++) {
				try {
					Thread.sleep(2000);
					System.out.println(i);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			System.out.println("ending");

	}

}
