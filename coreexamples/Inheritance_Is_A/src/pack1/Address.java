package pack1;

public class Address {
	
	private String streetName;
	private String cityName;
	private String countryName;
	private int pinCode;
	
	
	
	
	public Address(String streetName, String cityName, String countryName,
			int pinCode) {
		this.streetName = streetName;
		this.cityName = cityName;
		this.countryName = countryName;
		this.pinCode = pinCode;
	}


	
	
	public String getStreetName(){
		return streetName;
	}


	public String getCityName() {
		return cityName;
	}


	public String getCountryName() {
		return countryName;
	}


	public int getPinCode() {
		return pinCode;
	}
	
	
	

}
