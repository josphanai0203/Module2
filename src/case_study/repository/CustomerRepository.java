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

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.service.CustomerService;
import case_study.service.EmployeeService;

public class CustomerRepository implements ICustomerRepository{
	private static final String EMPLOYEE_PATH = "\\src\\case_study\\data\\customer.csv";
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
				List<String> strLine = parseCsvLine(line);
				String customerId = strLine.get(0);
				String fullName = strLine.get(1);
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				Calendar c = null;
				java.util.Date d;
				try {
					d = df.parse(strLine.get(2));
					c = Calendar.getInstance();
					c.setTime(d);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Calendar dateOfBirth = c;
				String identityCard = strLine.get(3);
				String phoneNumber = strLine.get(4);
				String email =strLine.get(5);
				String customerType = strLine.get(6);
				String address =strLine.get(7);
				Customer customer = new Customer(fullName, dateOfBirth, identityCard, phoneNumber, email, customerId, customerType, address);
				CustomerService.customers.add(customer);
				CustomerService.customersIds.add(customerId);
				
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
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
			for (Customer e : CustomerService.customers) {
				fileWriter.write(e.getCustomerId());
				fileWriter.write(COMMA_DELIMITER);
				fileWriter.write(e.getFullName());
				fileWriter.write(COMMA_DELIMITER);
				fileWriter.write(e.getDateOfBirth());
				fileWriter.write(COMMA_DELIMITER);
				fileWriter.write(e.getIdentityCard());
				fileWriter.write(COMMA_DELIMITER);
				fileWriter.write(e.getPhoneNumber());
				fileWriter.write(COMMA_DELIMITER);
				fileWriter.write(e.getEmail());
				fileWriter.write(COMMA_DELIMITER);
				fileWriter.write(e.getCustomerType());
				fileWriter.write(COMMA_DELIMITER);
				fileWriter.write(e.getAdress());
				fileWriter.write(NEW_LINE_SEPARATOR);
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
