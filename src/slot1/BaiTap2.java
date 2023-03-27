package slot1;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		try {
			int number = sc.nextInt();
			if (number >= 1000) {
				System.out.println("ability");
			} else if (number >= 100) {
				int tram = number / 100;
				donVi(tram);
				tram();
				number = number % 100;
				if (number < 20) {
					donVi(number);
				} else {
					int chuc = number / 10;
					chuc(chuc);
					donVi(number % 10);
				}

			} else if (number > 20) {
				int chuc = number / 10;
				chuc(chuc);
				donVi(number % 10);
			}
			if (number > 0) {
				donVi(number);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Wrong Input");
		}

	}

	public static void tram() {
		System.out.print("Hundred ");
	}

	public static void chuc(int a) {
		switch (a) {
		case 2:
			System.out.print("Twenty ");
			break;
		case 3:
			System.out.print("Thirty ");
			break;
		case 4:
			System.out.print("Forty ");
			break;
		case 5:
			System.out.print("Fifty ");
			break;
		case 6:
			System.out.print("Sixty ");
			break;
		case 7:
			System.out.print("Seventy ");
			break;
		case 8:
			System.out.print("Eighty ");
			break;
		case 9:
			System.out.print("Ninety ");
			break;

		default:
			break;
		}
	}

	public static void donVi(int a) {
		switch (a) {
		case 1:
			System.out.print("one ");
			break;
		case 2:
			System.out.print("two ");
			break;
		case 3:
			System.out.print("three ");
			break;
		case 4:
			System.out.print("four ");
			break;
		case 5:
			System.out.print("five ");
			break;
		case 6:
			System.out.print("six ");
			break;
		case 7:
			System.out.print("seven ");
			break;
		case 8:
			System.out.print("eight ");
			break;
		case 9:
			System.out.print("nine ");
			break;
		case 10:
			System.out.print("Ten");
			break;
		case 11:
			System.out.print("Eleven");
			break;
		case 12:
			System.out.print("Twelve");
			break;
		case 13:
			System.out.print("Thirteen");
			break;
		case 14:
			System.out.print("Fourteen");
			break;
		case 15:
			System.out.print("Fifteen");
			break;
		case 16:
			System.out.print("Sixteen");
			break;
		case 17:
			System.out.print("Seventeen");
			break;
		case 18:
			System.out.print("Eighteen");
			break;
		case 19:
			System.out.print("Nineteen");
			break;
		default:
			break;
		}
	}
}
