package milestone.cst135n;

import java.util.ArrayList;

public class BaseContact {

	private ArrayList<Photo> listOfPhotos = new ArrayList<>(); //null at the moment
	private String contactID;
	private String name;
	private String phone;
	private String location;

	public BaseContact(ArrayList<Photo> listOfPhotos, String contactID, String name, String phone, String location) {
		super();
		this.listOfPhotos = listOfPhotos;
		this.contactID = contactID;
		this.name = name;
		this.phone = phone;
		this.location = location;
	}

	public ArrayList<Photo> getListOfPhotos() {
		return listOfPhotos;
	}

	public void setListOfPhotos(ArrayList<Photo> listOfPhotos) {
		this.listOfPhotos = listOfPhotos;
	}

	public String getContactID() {
		return contactID;
	}

	public void setContactID(String contactID) {
		this.contactID = contactID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "BaseContact [listOfPhotos=" + listOfPhotos + ", contactID=" + contactID + ", name=" + name + ", phone="
				+ phone + ", location=" + location + "]";
	}

	
	
	

}
