package pack1;

public class Car implements Vehicle {

	private String modelName;
	private int capacity;

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public void startJourney() {
		// TODO Auto-generated method stub
		System.out.println("model: "+modelName+" capacity: "+capacity);
		System.out.println("used Car for Travel");
	}

}
