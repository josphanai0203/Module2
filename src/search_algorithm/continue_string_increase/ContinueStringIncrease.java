package search_algorithm.continue_string_increase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContinueStringIncrease {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi :");
		String str = sc.nextLine();
		ArrayList<Integer> list = new ArrayList<>();
		int  currentValueAscii = 0;
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(currentValueAscii < (int)ch) {
				System.out.print(ch);
				list.add((int)ch);
				currentValueAscii = (int)ch;
			}
			else {
				if(list.contains((int)ch)){
					
				}else {
					break;
				}
			}
		}
	}
}
