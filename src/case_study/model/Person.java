package case_study.model;

import java.sql.Date;
import java.util.Calendar;

public abstract class Person {
	protected String fullName;
	protected Calendar dateOfBirth;
	protected String identityCard;
	protected String phoneNumber;
	protected String email;
	public Person(String fullName, Calendar dateOfBirth, String identityCard, String phoneNumber, String email) {
		super();
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.identityCard = identityCard;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
