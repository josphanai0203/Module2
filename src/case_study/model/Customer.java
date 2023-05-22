package case_study.model;

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
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Customer Id : " + customerId + "\nFull Name : " + fullName + "\nDate of birth : " + String.format("%d/%d/%d", dateOfBirth.get(Calendar.DATE),dateOfBirth.get(Calendar.MONTH)+1,dateOfBirth.get(Calendar.YEAR))
				+ "\nIdentity Card : " + identityCard + "\nPhone Number : " + phoneNumber + "\nEmail : " + email
				+ "\nCustomer Type : " + customerType +"\nAddress : "+ adress;
	}
	

}
