package search_algorithm.string_increase;

import java.util.Scanner;

public class StringIncrease {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi : ");
		String[] str = sc.nextLine().split("");
		int  currentValueAscii = 0;
		for(int i = 0;i<str.length;i++) {
			char ch = str[i].charAt(0);
			if(currentValueAscii < (int)ch) {
				System.out.print(ch);
				currentValueAscii = (int)ch;
			}
		}
		
		sc.close();
	}
}
