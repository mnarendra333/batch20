class Animal
{
		public void sleep()
		{
			System.out.println("Animal is sleeeping");
		}
		public void action(){
			
			System.out.println("Animal action");
		}


}
class Dog extends Animal
{
		public void action(){
			
			System.out.println("Dog barks!!");
		}


}
class Cow  extends Animal
{
		public void action(){
			
			System.out.println("Cow Moing!!");
		}

}
class AnimalDemo
{
	public static void main(String args[])
	{
			Animal obj = new Dog();
			obj.action();
			obj.sleep();
		
	}


}