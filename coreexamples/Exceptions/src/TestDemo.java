
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("strting");
		
		try {
			int x  =10/0;
		} catch (Exception e) {
			System.out.println("dont enter zero in denomionator");
			e.printStackTrace();
		}
		finally{
			
		}
		System.out.println("ending");
		
		

	}

}
