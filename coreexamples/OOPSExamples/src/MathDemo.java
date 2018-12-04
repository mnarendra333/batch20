
public class MathDemo {
	
	
		public void sum(int x, int y){
			System.out.println("sum of 2 no's "+(x+y));
		}
		
		/*public void sum(long x, long y){
			System.out.println("sum of 2 no's "+(x+y));
		}*/
		
		/*public void sum(int x, int y,int z){
			System.out.println("sum of 3 no's "+(x+y+z));
		}*/
		
		public void sum(float x, float y){
			System.out.println("sumwith diff type "+(x+y));
		}
		
		public void sum(double x, double y){
			System.out.println("sum with diff type double "+(x+y));
		}
		
		/*public void sum(int x, float y){
			System.out.println("sum of order of params int float "+(x+y));
		}
		
		public void sum(float x, int y){
			System.out.println("sum of order of params  float int "+(x+y));
		}
		*/
		
		public static void main(String[] args) {
			
			
			MathDemo obj = new MathDemo();
			obj.sum(10, 20);
			//obj.sum(10.5f, 10.5f);
			
			
		}
	
	

}
