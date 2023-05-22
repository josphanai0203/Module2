package case_study.controller;

import java.util.Scanner;

import case_study.service.CustomerService;
import case_study.service.EmployeeService;

public class FuramaController {
	private static boolean isReadData = false;
	private static EmployeeService es = new EmployeeService();
	private static CustomerService cs = new CustomerService();
	

	public void displayMainMenu() {
		if (!isReadData) {
			EmployeeService.getData();
			CustomerService.getData();
			isReadData = true;
		}
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("============== Menu ===================");
			System.out.println("1.	Employee Management");
			System.out.println("2.	Customer Management");
			System.out.println("3.	Facility Management ");
			System.out.println("4.	Booking Management");
			System.out.println("5.	Promotion Management");
			System.out.println("6.	Exit");
			System.out.println("============== END ====================");
			System.out.println("\t Enter your choice :");
			try {
				choice = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Wrong input ! please enter again !");
			}
			switch (choice) {
			case 1:

				displayEmployeeManagementMenu();
				break;
			case 2:
				displayCustomerManagement();
				break;
			case 3:
				displayFacilityManagement();
				break;
			case 4:
				displayBookingManagerment();
				break;
			case 5:
				displayPromotionManagement();
				break;

			default:
				System.out.println("Your choice is Wrong !  please enter again !");
				break;
			}
			if (choice == 6) {
				System.exit(0);
				;
				break;
			}
		}
	}

	public void displayEmployeeManagementMenu() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("============== Employee Management  ===================");
			System.out.println("1	Display list employees");
			System.out.println("2	Add new employee");
			System.out.println("3	Edit employee");
			System.out.println("4	Return main menu");
			System.out.println("============== END ====================");
			System.out.println("\t Enter your choice :");
			try {
				choice = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Wrong input ! please enter again !");
			}
			switch (choice) {
			case 1:
				es.display();
				break;
			case 2:
				es.create();
				break;
			case 3:
				es.edit();
				break;
			default:
				break;
			}
			if(choice == 4) {
				break;
			}
		}
	}

	public void displayCustomerManagement() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("============== Customer Management  ===================");
			System.out.println("1.	Display list customers");
			System.out.println("2	Add new employee");
			System.out.println("3	Edit employee");
			System.out.println("4	Return main menu");
			System.out.println("============== END ====================");
			System.out.println("\t Enter your choice :");
			try {
				choice = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Wrong input ! please enter again !");
			}
			switch (choice) {
			case 1:
				cs.display();
				break;
			case 2:
				cs.create();
				break;
			case 3:
				cs.edit();
				break;
			default:
				break;
			}
			if(choice == 4) {
				break;
			}
		}
	}

	public void displayFacilityManagement() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("============== Facility Management   ===================");
			System.out.println("1.	Display list customers");
			System.out.println("2.	Add new customer");
			System.out.println("3.	Edit customer");
			System.out.println("4.	Return main menu");
			System.out.println("============== END ====================");
			System.out.println("\t Enter your choice :");
			try {
				choice = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Wrong input ! please enter again !");
			}
			switch (choice) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			default:
				break;
			}
			if(choice == 4) {
				break;
			}
		}
	}

	public void displayBookingManagerment() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("============== Booking Managerment    ===================");
			System.out.println("1.	Add new booking");
			System.out.println("2.	Display list booking");
			System.out.println("3.	Create new contracts");
			System.out.println("4.	Display list contracts");
			System.out.println("5.	Edit contracts");
			System.out.println("6.	Return main menu");
			System.out.println("============== END ====================");
			System.out.println("\t Enter your choice :");
			try {
				choice = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Wrong input ! please enter again !");
			}
			switch (choice) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			default:
				break;
			}
			if(choice == 6) {
				break;
			}
		}
	}

	public void displayPromotionManagement() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("============== Promotion Management   ===================");
			System.out.println("1.	Display list customers use service");
			System.out.println("2.	Display list customers get voucher");
			System.out.println("3.	Return main menu");
			System.out.println("============== END ====================");
			System.out.println("\t Enter your choice :");
			try {
				choice = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Wrong input ! please enter again !");
			}
			switch (choice) {
			case 1:

				break;
			case 2:

				break;
			default:
				break;
			}
			if(choice == 3) {
				break;
			}
		}
	}
}
