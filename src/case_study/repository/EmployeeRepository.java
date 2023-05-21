package case_study.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import case_study.model.Employee;
import case_study.service.EmployeeService;

public class EmployeeRepository implements IEmployeeRepository {
	private static final String EMPLOYEE_PATH = "\\src\\case_study\\data\\employee.csv";
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
			br = new BufferedReader(
					new FileReader(CURRENT_PATH));

			while ((line = br.readLine()) != null) {
				
				parseCsvLine(line);
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
			for (Employee e : EmployeeService.employees) {
				fileWriter.append(e.getEmployeeId());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.getFullName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.getDateOfBirth());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.getIdentityCard());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.getPhoneNumber());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.getEmail());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.getQualification());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(e.getPosition());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(Integer.toString(e.getSalary()));
				fileWriter.append(NEW_LINE_SEPARATOR);
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
