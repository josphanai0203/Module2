package case_study;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Action: ");
		String actionStr = sc.nextLine();
		String[] actionArr = actionStr.split(" ");
		String action = actionArr[0];
		String str = "123";
		switch (action) {
		case "lookup":
			System.out.println("-" +str +"\n"+str);
			break;
		case "drop":

			break;
		case "define":

			break;

		default:
			break;
		}
		sc.close();

	}
}
