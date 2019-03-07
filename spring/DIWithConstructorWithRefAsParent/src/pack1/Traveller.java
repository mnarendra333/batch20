package pack1;

public class Traveller {
	
	
	private Vehicle vehicle;

	/*public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/
	
	public Traveller(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	

	
	public void planTravel(){
		
		vehicle.startJourney();
		
	}

	
}
