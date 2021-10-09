package milestone.cst135n;

public class Location {

	private int locationID;
	private String streetName;
	private int streetNum;
	private String city;
	private String state;

	public Location(int locationID, String streetName, int streetNum, String city, String state) {
		super();
		this.locationID = locationID;
		this.streetName = streetName;
		this.streetNum = streetNum;
		this.city = city;
		this.state = state;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Location [locationID=" + locationID + ", streetName=" + streetName + ", streetNum=" + streetNum
				+ ", city=" + city + ", state=" + state + "]";
	}

	
	
	

}
