package case_study.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import case_study.model.Employee;
import case_study.model.Validator;
import case_study.service.impl.IEmployeeService;

public class EmployeeService extends PersonService implements IEmployeeService {
	public Scanner sc = new Scanner(System.in);
	public static List<Employee> employees = new ArrayList<>();
	public static List<String> employeeIds = new ArrayList<>();

	@Override
	public void display() {
		System.out.println("---------- Employee List ---------------");
		for (Employee e : employees) {
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
		Employee e = new Employee(fullName, dateOfBirth, identityCard, phoneNumber, email, employeeId, qualification, position, salary);
		employees.add(e);
		employeeIds.add(employeeId);
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub

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
			if (employeeIdstr.matches(Validator.REGEX_EMPLOYEE_ID)) {
				return employeeIdstr;
			} else {
				System.out.println("The email you just entered is  invalid !Please re-enter");
			}

		}
	}

	public String enterQualification() {
		int choice =0;
		while(true) {
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
		int choice =0;
		while(true) {
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
			}
			if(salary>0) {
				return salary;
			}else {
				System.out.println("Salary must greater than 0");
			}
			

		}

	}

}
