
public class MathOperations {

	
	public void sum(double x, double y){
		System.out.println("sum of 2 no's "+(x+y));
	}
	
	
	public void sum(int x, int y,int z){
		System.out.println("sum of 3 no's "+(x+y+z));
		
	}
	
	public static void main(String[] args) {
		
		MathOperations obj  = new MathOperations();
		obj.sum(10l, 20l);
		obj.sum(10, 20,30);

	}

}
