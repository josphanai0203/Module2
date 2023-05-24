package case_study.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import case_study.model.Employee;
import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.service.EmployeeService;
import case_study.service.FacilityService;
import case_study.util.Validator;

public class FacilityRepository implements IFacilityRepository {
	private static final String EMPLOYEE_PATH = "\\src\\case_study\\data\\facility.csv";
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String BASE_PATH = new File("").getAbsolutePath();
	private static final String CURRENT_PATH = BASE_PATH + EMPLOYEE_PATH;

	@Override
	public void saveDataToFile() {
		writeCsvFile(CURRENT_PATH);
	}

	@Override
	public void readData() {
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader(CURRENT_PATH));
			while ((line = br.readLine()) != null) {

				List<String> strLine = parseCsvLine(line);
				if (strLine.get(0).matches(Validator.REGEX_Villa_ID)) {
					String serviceCode = strLine.get(0);
					String serviceName = strLine.get(1);
					double area = Double.parseDouble(strLine.get(2));
					int ventPrice = Integer.parseInt(strLine.get(3));
					int maxUser = Integer.parseInt(strLine.get(4));
					String ventType = strLine.get(5);
					String roomStandard = strLine.get(6);
					double areaOfPool = Double.parseDouble(strLine.get(7));
					int totalOfFloor = Integer.parseInt(strLine.get(8));
					Villa v0 = new Villa(serviceCode, serviceName, area, ventPrice, maxUser, ventType, roomStandard, areaOfPool, totalOfFloor);
					FacilityService.facilityes.put(v0, Integer.parseInt(strLine.get(9)));
				} else if (strLine.get(0).matches(Validator.REGEX_HOUSE_ID)) {
					String serviceCode = strLine.get(0);
					String serviceName = strLine.get(1);
					double area = Double.parseDouble(strLine.get(2));
					int ventPrice = Integer.parseInt(strLine.get(3));
					int maxUser = Integer.parseInt(strLine.get(4));
					String ventType = strLine.get(5);
					String roomStandard = strLine.get(6);
					int totalOfFloor = Integer.parseInt(strLine.get(7));
					House h0 = new House(serviceCode, serviceName, area, ventPrice, maxUser, ventType, roomStandard, totalOfFloor);
					FacilityService.facilityes.put(h0, Integer.parseInt(strLine.get(8)));
				} else if (strLine.get(0).matches(Validator.REGEX_ROOM_ID)) {
					String serviceCode = strLine.get(0);
					String serviceName = strLine.get(1);
					double area = Double.parseDouble(strLine.get(2));
					int ventPrice = Integer.parseInt(strLine.get(3));
					int maxUser = Integer.parseInt(strLine.get(4));
					String ventType = strLine.get(5);
					String serviceFree = strLine.get(6);;
					Room r0 = new Room(serviceCode, serviceName, area, ventPrice, maxUser, ventType, serviceFree);
					FacilityService.facilityes.put(r0, Integer.parseInt(strLine.get(7)));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void writeCsvFile(String fileName) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(fileName);
			for (Facility fs : FacilityService.facilityes.keySet()) {
				if (fs.getServiceCode().matches(Validator.REGEX_Villa_ID)) {
					Villa v = (Villa) fs;
					fileWriter.write(v.getServiceCode());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(v.getServiceName());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Double.toString(v.getArea()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(v.getVentPrice()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(v.getMaxUser()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(v.getVentType());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(v.getRoomStandard());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Double.toString(v.getAreaOfPool()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(v.getTotalOfFloor()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(FacilityService.facilityes.get(fs)));
					fileWriter.write(NEW_LINE_SEPARATOR);
				} else if (fs.getServiceCode().matches(Validator.REGEX_ROOM_ID)) {
					Room r = (Room) fs;
					fileWriter.write(r.getServiceCode());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(r.getServiceName());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Double.toString(r.getArea()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(r.getVentPrice()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(r.getMaxUser()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(r.getVentType());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(r.getServiceFree());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(FacilityService.facilityes.get(fs)));
					fileWriter.write(NEW_LINE_SEPARATOR);
				} else if (fs.getServiceCode().matches(Validator.REGEX_HOUSE_ID)) {
					House h = (House) fs;
					fileWriter.write(h.getServiceCode());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(h.getServiceName());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Double.toString(h.getArea()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(h.getVentPrice()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(h.getMaxUser()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(h.getVentType());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(h.getRoomStandard());
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(h.getTotalOfFloor()));
					fileWriter.write(COMMA_DELIMITER);
					fileWriter.write(Integer.toString(FacilityService.facilityes.get(fs)));
					fileWriter.write(NEW_LINE_SEPARATOR);
				}

			}
		} catch (Exception e) {
			System.out.println("Error When save file !!!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}
		}
	}

	public static List<String> parseCsvLine(String csvLine) {
		List<String> result = new ArrayList<>();
		if (csvLine != null) {
			String[] splitData = csvLine.split(",");
			for (int i = 0; i < splitData.length; i++) {
				result.add(splitData[i]);
			}
		}
		return result;
	}
}
