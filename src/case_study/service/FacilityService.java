package case_study.service;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.repository.FacilityRepository;
import case_study.service.impl.IFacilityService;
import case_study.util.Validator;

public class FacilityService implements IFacilityService{
	private static final Scanner sc = new Scanner(System.in);
	public static LinkedHashMap<Facility,Integer> facilityes = new LinkedHashMap<>();
	private static FacilityRepository fr = new FacilityRepository();
	@Override
	public void display() {
		for(Facility f : facilityes.keySet()) {
			System.out.println("==============>");
			System.out.println(f);
			System.out.println("==============>");
		}
		
	}

	@Override
	public void create() {
		displayCreatMenu();
		
	}

	@Override
	public void edit() {
		
		
	}

	@Override
	public void delete() {
		
		
	}
	private void displayCreatMenu() {
		int choice = 0;
		while (true) {
			System.out.println("============== Create Facility Menu ===================");
			System.out.println("1.	Add New Villa");
			System.out.println("2.	Add New House");
			System.out.println("3.	Add New Room");
			System.out.println("4.	Back to menu");
			System.out.println("============== END ====================");
			System.out.println("\t Enter your choice :");
			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Wrong input ! please enter again !");
			}
			switch (choice) {
			case 1:
				addNewVilla();
				break;
			case 2:
				addNewHouse();
				break;
			case 3:
				addNewRoom();
				break;
			case 4:
				break;
			default:
				System.out.println("Your choice is Wrong !  please enter again !");
				break;
			}
			if (choice == 4) {
				break;
			}
		}
	}
	public String enterFacilityCode(String name,String regex) {
		String facilityCode = "";
		while (true) {
			System.out.println("Enter "+name+" : ");
			facilityCode = sc.nextLine();
			if (facilityCode.isEmpty()) {
				System.out.println("The input is empty !Please re-enter\"");
			} else if (facilityCode.matches(regex)) {
				return facilityCode;
			} else {
				System.out.println("The Facility you just entered is  invalid !Please re-enter");
			}
			
		}
	}
	public String enterServiceName() {
		String facilityName = "";
		while (true) {
			System.out.println("Enter Name Service : ");
			facilityName = sc.nextLine();
			if (facilityName.isEmpty()) {
				System.out.println("The input is empty !Please re-enter\"");
			} else if(facilityName.matches(Validator.REGEX_SERVICE_NAME)) {
				return facilityName;
			}else {
				System.out.println("The Name Service must uppercase firts letter");
			}
			
		}
	}
	public double enterArea() {
		double area = 0;
		while (true) {
			System.out.println("Enter Area : ");
			
			try {
				area = Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("The input is wrong !Please re-enter\"");
			}
			if (area<30.0) {
				System.out.println("The Area is greater than 30 m2 !Please re-enter\"");
			} else {
				return area;
			}
			
		}
	}
	public int enterVentPrice() {
		int ventPrice = 0;
		while (true) {
			System.out.println("Enter Price : ");
			
			try {
				ventPrice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("The Price is wrong !Please re-enter\"");
			}
			if (ventPrice<0) {
				System.out.println("The Price is greater than 0 !Please re-enter\"");
			} else {
				return ventPrice;
			}
			
		}
	}
	public int enterMaxUser() {
		int maxUser = 0;
		while (true) {
			System.out.println("Enter Max User : ");
			
			try {
				maxUser = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("The Max User is wrong !Please re-enter\"");
			}
			if (maxUser<0 && maxUser >=20) {
				System.out.println("The Max User is greater than 0 and less than 20 !Please re-enter\"");
			} else {
				return maxUser;
			}
			
		}
	}
	public String enterRoomStandard() {
		int choice = 0;
		while (true) {
			Scanner newSc = new Scanner(System.in);
			System.out.println("======>>> Room Standard");
			System.out.println("1. 1 Star");
			System.out.println("2. 2 Star");
			System.out.println("3. 3 Star");
			System.out.println("4. 4 Star");
			System.out.println("5. 5 Star");
			System.out.println("Select choice :");
			try {
				choice = newSc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Input Wrong!Please re-enter");
				continue;
			}
			switch (choice) {
			case 1:
				return "1 Star";
			case 2:

				return "2 Star";
			case 3:

				return "3 Star";
			case 4:

				return "4 Star";
			case 5:
				
				return "5 Star";

			default:
				System.out.println("You must select 1 to 5 ! Please re-enter ");
				break;
			}

		}
	}
	public double enterAreaOfPool() {
		double area = 0;
		while (true) {
			System.out.println("Enter Area of Pool: ");
			
			try {
				area = Double.parseDouble(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("The input is wrong !Please re-enter\"");
			}
			if (area<30.0) {
				System.out.println("The Area of Pool is greater than 30 m2 !Please re-enter\"");
			} else {
				return area;
			}
			
		}
	}
	public int enterTotalOfFloor() {
		int totalOfFloor = 0;
		while (true) {
			System.out.println("Enter total of floor : ");
			
			try {
				totalOfFloor = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("The total of floor is wrong !Please re-enter\"");
			}
			if (totalOfFloor<0) {
				System.out.println("The total of floor is greater than 0 !Please re-enter\"");
			} else {
				return totalOfFloor;
			}
			
		}
	}
	public String enterServiceFree() {
		String sẻviceFree = "";
		while (true) {
			System.out.println("Enter Service Free: ");
			sẻviceFree = sc.nextLine();
			if (sẻviceFree.isEmpty()) {
				System.out.println("The input is empty !Please re-enter\"");
			} else if(sẻviceFree.matches(Validator.REGEX_SERVICE_NAME)) {
				return sẻviceFree;
			}else {
				System.out.println("The Service Free must uppercase firts letter");
			}
			
		}
	}
	public String enterVentType() {
		int choice = 0;
		while (true) {
			Scanner newSc = new Scanner(System.in);
			System.out.println("======>>> Vent Type");
			System.out.println("1. Year");
			System.out.println("2. Month");
			System.out.println("3. Day");
			System.out.println("4. Hour");
			System.out.println("Select choice :");
			try {
				choice = newSc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Input Wrong!Please re-enter");
				continue;
			}
			switch (choice) {
			case 1:
				return "Year";
			case 2:

				return "Month";
			case 3:

				return "Day";
			case 4:

				return "Hour";
			default:
				System.out.println("You must select 1 to 4 ! Please re-enter ");
				break;
			}

		}
	}
	public void addNewVilla() {
		String serviceCode = enterFacilityCode("Villa Code", Validator.REGEX_Villa_ID);
		String serviceName = enterServiceName();
		double area = enterArea();
		int ventPrice = enterVentPrice();
		int maxUser = enterMaxUser();
		String ventType = enterVentType();
		String roomStandard = enterRoomStandard();
		double areaOfPool = enterAreaOfPool();
		int totalOfFloor = enterTotalOfFloor();
		Villa villa = new Villa(serviceCode, serviceName, area, ventPrice, maxUser, ventType, roomStandard, areaOfPool, totalOfFloor);
		facilityes.put(villa, 0);
		fr.saveDataToFile();
	}
	public void addNewRoom() {
		String serviceCode = enterFacilityCode("Room Code", Validator.REGEX_ROOM_ID);
		String serviceName = enterServiceName();
		double area = enterArea();
		int ventPrice = enterVentPrice();
		int maxUser = enterMaxUser();
		String ventType = enterVentType();
		String serviceFree = enterServiceFree();
		Room r1 = new Room(serviceCode, serviceName, area, ventPrice, maxUser, ventType, serviceFree);
		facilityes.put(r1, 0);
		fr.saveDataToFile();
	}
	public void addNewHouse() {
		String serviceCode = enterFacilityCode("House Code", Validator.REGEX_HOUSE_ID);
		String serviceName = enterServiceName();
		double area = enterArea();
		int ventPrice = enterVentPrice();
		int maxUser = enterMaxUser();
		String ventType = enterVentType();
		String roomStandard = enterRoomStandard();
		int totalOfFloor = enterTotalOfFloor();
		House h1 = new House(serviceCode, serviceName, area, ventPrice, maxUser, ventType, roomStandard, totalOfFloor);
		facilityes.put(h1, 0);
		fr.saveDataToFile();
	}
	public static void getData() {
		fr.readData();
	}

}