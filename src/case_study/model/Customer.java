package case_study.model;

import java.sql.Date;
import java.util.Calendar;

public class Customer extends Person {
	private String customerId;
	private String customerType;
	private String adress;
	public Customer(String fullName, Calendar dateOfBirth, String identityCard, String phoneNumber, String email,
			String customerId, String customerType, String adress) {
		super(fullName, dateOfBirth, identityCard, phoneNumber, email);
		this.customerId = customerId;
		this.customerType = customerType;
		this.adress = adress;
	}
	
	

}
