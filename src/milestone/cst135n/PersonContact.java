package milestone.cst135n;

import java.util.ArrayList;

public class PersonContact extends BaseContact { 

	private String birthDate;
	private String description;

	public PersonContact(ArrayList<Photo> listOfPhotos, String contactID, String name, String phone, String location,
			String birthDate, String description) {
		super(listOfPhotos, contactID, name, phone, location);
		this.birthDate = birthDate;
		this.description = description;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PersonContact [birthDate=" + birthDate + ", description=" + description + ", toString()="
				+ super.toString() + "]"; //since it's a child class there's a toString added within the the toString
	}

	

	
	

	
	

}
