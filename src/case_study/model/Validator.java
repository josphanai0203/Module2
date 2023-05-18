package case_study.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validator {
	public static final String REGEX_FULL_NAME = "[A-Z][a-z]+((\\s[A-Z][a-z]+)+)?";
	public static final String REGEX_IDENTITY_CARD = "[0-9]{9}";
	public static final String REGEX_EMAIL = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
	public static final String REGEX_PHONE_NUMBER = "^[0][0-9]{9}";
	public static final String REGEX_EMPLOYEE_ID= "^[N][V][-][0-9]{4}";

	public static boolean isValidDate(String date) {
		String dateFormat = "DD/MM/YYYY";
		DateFormat sdf = new SimpleDateFormat(dateFormat);
		try {
			sdf.parse(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
}
