package case_study;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Action: ");
		String actionStr = sc.nextLine();
		String[] actionArr = actionStr.split(" ");
		String action = actionArr[0];
		Dictionary ds = new Dictionary();
		switch (action) {
		case "lookup":
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
