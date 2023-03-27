package slot1;

import java.util.Locale;
import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		double rate = 23000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number of USD : ");
		try {
			double usd = sc.nextDouble();
			double vnd = usd * rate ;
			System.out.println(String.format(Locale.getDefault(),"VND : %,.0f",vnd));
		} catch (Exception e) {
			System.out.println("Wrong Input");
		}
	}
}
