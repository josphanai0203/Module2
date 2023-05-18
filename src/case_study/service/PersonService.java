package case_study.service;

import java.util.Calendar;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import case_study.model.Validator;
import case_study.service.impl.IPersonService;

public class PersonService implements IPersonService {
	private Scanner sc = new Scanner(System.in);

	@Override
	public String enterFullName(String messString) {
		boolean check = false;
		String name = "";
		while (!check) {
			System.out.println("Enter " + messString);
			name = sc.nextLine();
			if (!name.matches(Validator.REGEX_FULL_NAME)) {
				System.out.println("The name you just entered is  invalid !Please re-enter");
			} else {
				check = true;
			}
		}
		return name;

	}

	@Override
	public Calendar enterdateOfBirth(){
		String date;
		while (true) {

			System.out.println("Enter Date of birth(DD/MM/YYYY) : ");
			date = sc.nextLine();
			if (Validator.isValidDate(date)) {
				Calendar c = stringToCalendar(date);
				if (isEnoughAge(c)) {
					return c;
				} else {
					System.out.println("The age must greater than 18 years old ! ");
				}
			} else {
				System.out.println("The date of birth you just entered is  invalid !Please re-enter");
			}
		}
	}

	@Override
	public String enterIdentityCard() {
		String identityCard = "";
		while (true) {
			System.out.println("Enter Identity Card (9 Numbers) : ");
			identityCard = sc.nextLine();
			if (identityCard.matches(Validator.REGEX_IDENTITY_CARD)) {
				return identityCard;
			} else {
				System.out.println("The Identity Card you just entered is  invalid !Please re-enter");
			}

		}
	}

	@Override
	public String enterPhoneNumber() {
		String phoneNumber = "";
		while (true) {
			System.out.println("Enter phone number (10 Numbers) : ");
			phoneNumber = sc.nextLine();
			if (phoneNumber.matches(Validator.REGEX_PHONE_NUMBER)) {
				return phoneNumber;
			} else {
				System.out.println("The phone number you just entered is  invalid !Please re-enter");
			}

		}
	}

	@Override
	public String enterEmail() {
		String email = "";
		while (true) {
			System.out.println("Enter email: ");
			email = sc.nextLine();
			if (email.matches(Validator.REGEX_EMAIL)) {
				return email;
			} else {
				System.out.println("The email you just entered is  invalid !Please re-enter");
			}

		}

	}

	private boolean isEnoughAge(Calendar date) {
		int validAge = 365 * 18;
		Calendar now = Calendar.getInstance();
		int ageCheck = now.get(Calendar.YEAR) - date.get(Calendar.YEAR) - 1;
		int dayCheck = now.get(Calendar.MONTH) + (12 - date.get(Calendar.MONTH));
		int check = (ageCheck * 365) + (dayCheck * 30);
		if (check < validAge) {
			return false;
		} else {
			return true;
		}
	}
	public Calendar stringToCalendar(String date) {
		DateFormat df = new SimpleDateFormat("DD/MM/YYYY");
		Calendar c = null;
		java.util.Date d;
		try {
			d = df.parse(date);
			c = Calendar.getInstance();
			c.setTime(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

}
