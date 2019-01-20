package sorting;

public class Bus implements Comparable<Bus>
{
	
	private int BusId;
	private String BusName;
	private String BusType;
	private int fare;

	
	public Bus(int busId, String busName, String busType, int fare) {
		super();
		BusId = busId;
		BusName = busName;
		BusType = busType;
		this.fare = fare;
	}
	
	

	public int getBusId() {
		return BusId;
	}



	public String getBusName() {
		return BusName;
	}



	public String getBusType() {
		return BusType;
	}



	public int getFare() {
		return fare;
	}
	


	@Override
	public int compareTo(Bus o) {
	 int fare2 = this.getFare();
	 int fare3 = o.getFare();
	 
		return fare2>fare3?1:fare2<fare3?-1:0;
	}



	@Override
	public String toString() {
		return "Bus [BusId=" + BusId + ", BusName=" + BusName + ", BusType="
				+ BusType + ", fare=" + fare + "]";
	}



	
	
	
}
