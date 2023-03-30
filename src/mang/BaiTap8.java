package mang;

import java.util.Scanner;

public class BaiTap8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String(" You - you alone will have the stars as no one else has them...In one of the stars I shall be living. In one of them I shall be laughing. And so it will be as if all the stars were laughing, when you look at the sky at night...You - only you - will have stars that can laugh.");
		System.out.println(str);
		System.out.println("Nhập kí tự bạn muốn kiểm tra :");
		char character = sc.next().charAt(0) ;
		int count = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) == character) {
				count+=1;
			}
		}
		System.out.println("Kí tự "+character+" xuất hiện "+ count+" Lần"); 
	}
}
