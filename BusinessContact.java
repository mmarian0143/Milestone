package milestone.cst135n;

import java.util.ArrayList;

public class BusinessContact extends BaseContact {

	private String businessHours;
	private String websiteURL;

	public BusinessContact(ArrayList<Photo> listOfPhotos, String contactID, String name, String phone, String location,
			String businessHours, String websiteURL) {
		super(listOfPhotos, contactID, name, phone, location);
		this.businessHours = businessHours;
		this.websiteURL = websiteURL;
	}

	public String getBusinessHours() {
		return businessHours;
	}

	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	public String getWebsiteURL() {
		return websiteURL;
	}

	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}

	@Override
	public String toString() {
		return "BusinessContact [businessHours=" + businessHours + ", websiteURL=" + websiteURL + ", toString()="
				+ super.toString() + "]";
	}

	



	

	

}
