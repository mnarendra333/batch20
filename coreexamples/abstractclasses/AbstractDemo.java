class AbstractDemo
{

	public static void main(String args[])
	{
		
		//Shape obj = new Shape(); Shape is abstract; cannot be instantiated
		Shape obj = new Rectangle();
		int sides = obj.getSides();
		System.out.println("no of sides are "+sides);
		obj.draw();
		
		
		
	}

}