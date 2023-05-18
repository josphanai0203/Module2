package case_study.test_case;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Testall {
public static void main(String[] args) throws ParseException {
	Scanner sc = new Scanner(System.in);
	System.out.println("line :");
	String date = sc.nextLine();
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	java.util.Date d =  df.parse(date);
	Calendar m = Calendar.getInstance();
	m.setTime(d);
	Calendar c = Calendar.getInstance();
	int year = c.get(Calendar.YEAR);
	System.out.println(String.format("%d/%d/%d", m.get(Calendar.YEAR),m.get(Calendar.MONTH)+1,m.get(Calendar.DATE)));
}
}
