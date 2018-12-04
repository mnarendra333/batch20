
class SuperClass {
	
	int x = 20;
	int y=40;
	
	public SuperClass(){
		System.out.println("SuperClass dc invoked");
	}
	public void sum(int x ,int y){
		System.out.println("Parent class sum method");
		System.out.println("sum is "+(x+y));
	}

}
class SubClass extends SuperClass
{
	
	int z = 60;
	
	public SubClass(){
		super();
		System.out.println("SubClass dc invoked");
	}
	public void mul(int x ,int y){
		System.out.println(this.getClass());
		System.out.println("mul is "+(x*y));
	}
	public static void main(String[] args) {
		
		
		SubClass obj = new SubClass();
		System.out.println(obj.x+" "+obj.y+" "+obj.z);
		obj.sum(40, 50);
		obj.mul(40, 50);
	}
	
	
}
