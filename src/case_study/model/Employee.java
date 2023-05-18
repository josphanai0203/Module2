package case_study.model;

import java.util.Calendar;

public class Employee extends Person {
	private String employeeId;
	private String qualification;
	private String position;
	private int salary;

	public Employee(String fullName, Calendar dateOfBirth, String identityCard, String phoneNumber, String email,
			String employeeId, String qualification, String position, int salary) {
		super(fullName, dateOfBirth, identityCard, phoneNumber, email);
		this.employeeId = employeeId;
		this.qualification = qualification;
		this.position = position;
		this.salary = salary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee Id : " + employeeId + "\nFull Name : " + fullName + "\nDate of birth : " + dateOfBirth
				+ "\nIdentity Card : " + identityCard + "\nPhone Number : " + phoneNumber + "\nEmail : " + email
				+ "\nQualification : " + qualification +"\nPosition : "+ position + "\nSalary : "+ salary;
	}

}
