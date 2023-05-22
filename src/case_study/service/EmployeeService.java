package case_study.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.service.impl.IEmployeeService;
import case_study.util.Validator;

public class EmployeeService extends PersonService implements IEmployeeService {
	public Scanner sc = new Scanner(System.in);
	public static List<Employee> employees = new ArrayList<>();
	public static List<String> employeeIds = new ArrayList<>();
	private static EmployeeRepository er = new EmployeeRepository();

	@Override
	public void display() {
		System.out.println("---------- Employee List ---------------");
		for (Employee e : EmployeeService.employees) {
			System.out.println(e);
			System.out.println("=====>");
		}
		System.out.println("----------      End      ---------------");

	}

	@Override
	public void create() {
		String employeeId = enterEmployeeId();
		String fullName = enterFullName("Employee Name :");
		Calendar dateOfBirth = enterdateOfBirth();
		String identityCard = enterIdentityCard();
		String phoneNumber = enterPhoneNumber();
		String email = enterEmail();
		String qualification = enterQualification();
		String position = enterPosition();
		int salary = enterSalary();
		Employee e = new Employee(fullName, dateOfBirth, identityCard, phoneNumber, email, employeeId, qualification,
				position, salary);
		employees.add(e);
		employeeIds.add(employeeId);
		er.saveDataToFile();
	}

	@Override
	public void edit() {
		boolean isExist = false;
		String employeeId = null;
		while (!isExist) {
			employeeId = enterEmployeeId();
			if (!checkEmployeeId(employeeId)) {
				System.out.println("ID not Exist ! please re-enter");
			} else {
				isExist = true;
			}
		}
		for (Employee e : employees) {
			if (e.getEmployeeId().equals(employeeId)) {
				displayMenuEdit(e);
			}
		}
		

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	public String enterEmployeeId() {
		String employeeIdstr = "";
		while (true) {
			System.out.println("Enter employee id (NV-XXXX): ");
			employeeIdstr = sc.nextLine();
			if (employeeIdstr.isEmpty()) {
				System.out.println("The input is empty !Please re-enter\"");
			} else if (employeeIdstr.matches(Validator.REGEX_EMPLOYEE_ID)) {
				if(checkEmployeeId(employeeIdstr)) {
					System.out.println("The Id has exist ! Please enter new Id!!");
				}else {
					return employeeIdstr;
					
				}
			} else {
				System.out.println("The employee id you just entered is  invalid !Please re-enter");
			}

		}
	}

	public String enterQualification() {
		int choice = 0;
		while (true) {
			Scanner newSc = new Scanner(System.in);
			System.out.println("======>>> Qualification");
			System.out.println("1.Intermediate");
			System.out.println("2.College");
			System.out.println("3.Undergraduate ");
			System.out.println("4.Graduate");
			System.out.println("Select choice :");
			try {
				choice = newSc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Input Wrong!Please re-enter");
				continue;
			}
			switch (choice) {
			case 1:
				return "Intermediate";
			case 2:

				return "College";
			case 3:

				return "Undergraduate";
			case 4:

				return "Graduate";

			default:
				System.out.println("You must select 1 to 4 ! Please re-enter ");
				break;
			}

		}
	}

	public String enterPosition() {
		int choice = 0;
		while (true) {
			Scanner newSc = new Scanner(System.in);
			System.out.println("======>>> Qualification");
			System.out.println("1.Receptionist");
			System.out.println("2.Waiter");
			System.out.println("3.Specialist ");
			System.out.println("4.Supervisor");
			System.out.println("5.Manager");
			System.out.println("6.Director");
			System.out.println("Select choice :");
			try {
				choice = newSc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Input Wrong!Please re-enter");
				continue;
			}
			switch (choice) {
			case 1:
				return "Receptionist";
			case 2:

				return "Waiter";
			case 3:

				return "Specialist";
			case 4:

				return "Supervisor";
			case 5:

				return "Manager";
			case 6:

				return "Director";

			default:
				System.out.println("You must select 1 to 6 ! Please re-enter ");
				break;
			}

		}
	}

	public int enterSalary() {
		int salary = 0;
		while (true) {
			Scanner newSc = new Scanner(System.in);
			System.out.println("Enter salary: ");
			try {
				salary = newSc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Input Wrong!Please re-enter");
				continue;
			} catch (NoSuchElementException e) {
				System.out.println("Input is Empty!Please re-enter");
				continue;
			}

			if (salary > 0) {
				return salary;
			} else {
				System.out.println("Salary must greater than 0");
			}

		}

	}

	public boolean checkEmployeeId(String employeeId) {
		for (String eId : employeeIds) {
			if (employeeId.equals(eId)) {
				return true;
			}
		}
		return false;

	}

	public void displayMenuEdit(Employee currentEmployee) {
		int choice = 0;
		while (true) {
			System.out.println("============== Edit ===================");
			System.out.println("1. Name");
			System.out.println("2. Date of Birth");
			System.out.println("3. Indentity Card");
			System.out.println("4. Phone Number");
			System.out.println("5. Email");
			System.out.println("6. Qualification");
			System.out.println("7. Position");
			System.out.println("8. Salary");
			System.out.println("9.	Exit");
			System.out.println("============== END ====================");
			System.out.println(" Enter your choice :");
			try {
				choice = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Wrong input ! please enter again !");
			}
			switch (choice) {
			case 1:
				String newName = enterFullName("new Employee Name :");
				currentEmployee.setFullName(newName);
				System.out.println("==> Edited ");
				break;
			case 2:
				Calendar newDate = enterdateOfBirth();
				currentEmployee.setDateOfBirth(newDate);
				break;
			case 3:
				String newIndentityCard = enterIdentityCard();
				currentEmployee.setIdentityCard(newIndentityCard);
				System.out.println("==> Edited ");
				break;
			case 4:
				String newPhoneNumber = enterPhoneNumber();
				currentEmployee.setPhoneNumber(newPhoneNumber);
				System.out.println("==> Edited ");
				break;
			case 5:
				String newEmail = enterEmail();
				currentEmployee.setEmail(newEmail);
				System.out.println("==> Edited ");
				break;
			case 6:
				String newQualification = enterQualification();
				currentEmployee.setQualification(newQualification);
				System.out.println("==> Edited ");
				break;
			case 7:
				String newPosition = enterPosition();
				currentEmployee.setPosition(newPosition);
				System.out.println("==> Edited ");
				break;
			case 8:
				int newSalary = enterSalary();
				currentEmployee.setSalary(newSalary);
				System.out.println("==> Edited ");
				break;
			case 9:
				break;

			default:
				System.out.println("You must choice 1 to 9 ! please re-enter");
				break;
			}
			if (choice == 9) {
				er.saveDataToFile();
				break;
			}
		}

	}

	public static void getData() {
		er.readData();
	}

}
