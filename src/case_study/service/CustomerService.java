package case_study.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;
import case_study.service.impl.ICustomerService;
import case_study.util.Validator;

public class CustomerService extends PersonService implements ICustomerService {
	public Scanner sc = new Scanner(System.in);
	public static List<Customer> customers = new ArrayList<>();
	public static List<String> customersIds = new ArrayList<>();
	private static CustomerRepository cr = new CustomerRepository();

	@Override
	public void display() {
		System.out.println("---------- Employee List ---------------");
		for (Customer e : CustomerService.customers) {
			System.out.println(e);
			System.out.println("=====>");
		}
		System.out.println("----------      End      ---------------");

	}

	@Override
	public void create() {
		String customerId = enterCustomId();
		String fullName = enterFullName("Customer Name :");
		Calendar dateOfBirth = enterdateOfBirth();
		String identityCard = enterIdentityCard();
		String phoneNumber = enterPhoneNumber();
		String email = enterEmail();
		String customerType = enterCustomerType();
		String address = enterAddress();
		Customer c = new Customer(fullName, dateOfBirth, identityCard, phoneNumber, email, customerId, customerType, address);
		customers.add(c);
		customersIds.add(customerId);
		cr.saveDataToFile();
	}

	@Override
	public void edit() {
		boolean isExist = false;
		String customerId = null;
		while (!isExist) {
			customerId = enterCustomId();
			if (!checkCustomerId(customerId)) {
				System.out.println("ID not Exist ! please re-enter");
			} else {
				isExist = true;
			}
		}
		for (Customer c : customers) {
			if (c.getCustomerId().equals(customerId)) {
				displayMenuEdit(c);
			}
		}
		

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	public String enterCustomId() {
		String customerIdstr = "";
		while (true) {
			System.out.println("Enter customer id (KH-YYYY): ");
			customerIdstr = sc.nextLine();
			if (customerIdstr.isEmpty()) {
				System.out.println("The input is empty !Please re-enter\"");
			} else if (customerIdstr.matches(Validator.REGEX_CUSTOMER_ID)) {
				return customerIdstr;
			} else {
				System.out.println("The customer id you just entered is  invalid !Please re-enter");
			}

		}
	}

	public String enterCustomerType() {
		int choice = 0;
		while (true) {
			Scanner newSc = new Scanner(System.in);
			System.out.println("======>>> Customer Type");
			System.out.println("1.Diamond");
			System.out.println("2.Platinum");
			System.out.println("3.Gold ");
			System.out.println("4.Silver");
			System.out.println("5.Member");
			System.out.println("Select choice :");
			try {
				choice = newSc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Input Wrong!Please re-enter");
				continue;
			}
			switch (choice) {
			case 1:
				return "Diamond";
			case 2:

				return "Platinum";
			case 3:

				return "Gold";
			case 4:

				return "Silver";
			case 5:

				return "Member";

			default:
				System.out.println("You must select 1 to 4 ! Please re-enter ");
				break;
			}
		}

	}
	public String enterAddress() {
		String address = "";
		while (true) {
			System.out.println("Enter Address: ");
			address = sc.nextLine();
			if (address.isEmpty()) {
				System.out.println("The input is empty !Please re-enter\"");
			}else {
				return address;
			}

		}
	}
	public boolean checkCustomerId(String customerId) {
		for (String id : customersIds) {
			if (id.equals(customerId)) {
				return true;
			}
		}
		return false;

	}

	public void displayMenuEdit(Customer currentCustomer) {
		int choice = 0;
		while (true) {
			System.out.println("============== Edit ===================");
			System.out.println("1. Name");
			System.out.println("2. Date of Birth");
			System.out.println("3. Indentity Card");
			System.out.println("4. Phone Number");
			System.out.println("5. Email");
			System.out.println("6. Customer Type");
			System.out.println("7. Address");;
			System.out.println("8.	Exit");
			System.out.println("============== END ====================");
			System.out.println(" Enter your choice :");
			try {
				choice = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Wrong input ! please enter again !");
			}
			switch (choice) {
			case 1:
				String newName = enterFullName("new Customer Name :");
				currentCustomer.setFullName(newName);
				System.out.println("==> Edited ");
				break;
			case 2:
				Calendar newDate = enterdateOfBirth();
				currentCustomer.setDateOfBirth(newDate);
				System.out.println("==> Edited ");
				break;
			case 3:
				String newIndentityCard = enterIdentityCard();
				currentCustomer.setIdentityCard(newIndentityCard);
				System.out.println("==> Edited ");
				break;
			case 4:
				String newPhoneNumber = enterPhoneNumber();
				currentCustomer.setPhoneNumber(newPhoneNumber);
				System.out.println("==> Edited ");
				break;
			case 5:
				String newEmail = enterEmail();
				currentCustomer.setEmail(newEmail);
				System.out.println("==> Edited ");
				break;
			case 6:
				String newCustomerType = enterCustomerType();
				currentCustomer.setCustomerType(newCustomerType);
				System.out.println("==> Edited ");
				break;
			case 7:
				String newAddress = enterAddress();
				currentCustomer.setAdress(newAddress);
				System.out.println("==> Edited ");
				break;
			case 8:
				break;
			default:
				System.out.println("You must choice 1 to 8 ! please re-enter");
				break;
			}
			if (choice == 8) {
				cr.saveDataToFile();
				break;
			}
		}

	}

	public static void getData() {
		cr.readData();
	}
}

