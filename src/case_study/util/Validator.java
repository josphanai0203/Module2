package case_study.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Validator {
	public static final String REGEX_FULL_NAME = "[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+((\\s[AÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬBCDĐEÈẺẼÉẸÊỀỂỄẾỆFGHIÌỈĨÍỊJKLMNOÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢPQRSTUÙỦŨÚỤƯỪỬỮỨỰVWXYỲỶỸÝỴZ][aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz]+)+)?";
	public static final String REGEX_IDENTITY_CARD = "[0-9]{9}";
	public static final String REGEX_EMAIL = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
	public static final String REGEX_PHONE_NUMBER = "^[0][0-9]{9}";
	public static final String REGEX_EMPLOYEE_ID = "^[N][V][-][0-9]{4}";
	public static final String REGEX_CUSTOMER_ID = "^[K][H][-][0-9]{4}";
	public static final String REGEX_Villa_ID = "^SVVL[-][0-9]{4}";
	public static final String REGEX_HOUSE_ID = "^SVHO[-][0-9]{4}";
	public static final String REGEX_ROOM_ID = "^SVRO[-][0-9]{4}";
	public static final String REGEX_SERVICE_NAME = "^[A-Z][a-z]+";

	public static boolean isValidDate(String date) {
		String dateFormat = "dd/MM/yyyy";
		DateFormat sdf = new SimpleDateFormat(dateFormat);
		try {
			Date d = sdf.parse(date);
			String[] l = date.split("/");
			if(Integer.parseInt(l[0]) <0 || Integer.parseInt(l[0])>31) {
				return false;
			}else if(Integer.parseInt(l[1]) <0 || Integer.parseInt(l[1]) >12) {
				return false;
			}else if(Integer.parseInt(l[2]) <0) {
				return false;
			}
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
}
