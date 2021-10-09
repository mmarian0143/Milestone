package milestone.cst135n;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	private String name;
	private Scanner sc = new Scanner(System.in);
	private List<BaseContact> contacts = new ArrayList<>();

	// Constructor
	AddressBook(String name) {
		this.name = name;
	}

	// Overload Constructor
	AddressBook() {

	}

	public void open() {
		System.out.println("SYSTEM MESSAGE: The address book is now open!");

		mainMenu();
	}

	private void mainMenu() {

		int option = 0;
		do {
			System.out.println("====================");
			System.out.println("+++ Address Book +++");
			System.out.println("====================");
			System.out.println("1. Create Person Contact");
			System.out.println("2. Create Business Contact");
			System.out.println("3. Show All Contacts");
			System.out.println("4. Show Details of One Contact");
			System.out.println("5. Update A Contact");
			System.out.println("6. Delete A Contact");
			System.out.println("7. Search for a Contact by Name");
			System.out.println("8. Sort All Contacts by Name");
			System.out.println("9. Exit");
			System.out.println("====================");
			System.out.print("Please select an option: ");

			option = sc.nextInt(); // Return
			sc.nextLine(); // Consume the return
			switch (option) {

			case 1:
				addPersonContact();
				break;
			case 2:
				addBusinessContact();
				break;
			case 3:
				viewAll();
				break;
			case 4:
				showDetails();
				break;
			case 5:
				updateContact();
				break;
			case 6:
				deleteContact();
				break;
			case 7:
				searchContact();
				break;
			case 8:
				sortContactName();
				break;
			case 9:
				System.out.println("*** This selection exits the address book! ***");
				break;
			default:

			}
		} while (option != 9);
	}

	private void addPersonContact() {
		System.out.println("*** This selection adds a person contact! ***");
		System.out.println("Person contact added!");
		System.out.println("=================");
		System.out.println("What's the contact's ID?");
		String id = sc.nextLine();
		System.out.println("What do you want to name this contact?");
		String name = sc.nextLine();
		System.out.println("What's the contact's phone number?");
		String number = sc.nextLine();
		System.out.println("What's the contact's location?");
		String location = sc.nextLine();
		System.out.println("What's the contact's DOB?");
		String birthDay = sc.nextLine();
		System.out.println("Description of contact: ");
		String description = sc.nextLine();
		
		contacts.add(new PersonContact(null, id, name, number, location, birthDay, description));

	}

	private void addBusinessContact() {
		System.out.println("*** This selection adds a business contact! ***");
		System.out.println("Business contact added!");
		System.out.println("=================");
		System.out.println("What's the contact's ID?");
		String id = sc.nextLine();
		System.out.println("What do you want to name this contact?");
		String name = sc.nextLine();
		System.out.println("What's the contact's phone number?");
		String number = sc.nextLine();
		System.out.println("What's the contact's location?");
		String location = sc.nextLine();
		System.out.println("What's the contact's business hours?");
		String businessHours = sc.nextLine();
		System.out.println("What's the contact's URL? ");
		String webURL = sc.nextLine();
		
		contacts.add(new BusinessContact(null, id, name, number, location, businessHours, webURL));
	}

	private void viewAll() {
		System.out.println("*** This selection views all options! ***");
		System.out.println("Viewing all options!");
		System.out.println("=================");
		int counter = 0;
		for (BaseContact contactItem : contacts) {
			System.out.print(counter++ + ". ");
			System.out.println(contactItem);
		}

	}

	private void deleteContact() {
		System.out.println("*** This selection deletes the selected item! ***");
//		System.out.println("Deleting item!");
//		System.out.println("=================");
//		viewAll();
//		System.out.println("Which item do you want to delete?");
//		int item = sc.nextInt();
//		sc.nextLine();
	}

	private void showDetails() {
		System.out.println("*** This selection shows the details of the contact! ***"); //at the moment they just say what they do..well fix in the future
	}

	private void updateContact() {
		System.out.println("*** This selection updates the contact! ***");
	}

	private void searchContact() {
		System.out.println("*** This selection searches for a contact! ***");
	}

	private void sortContactName() {
		System.out.println("*** This selection sorts each contact by name! ***");
	}

}
