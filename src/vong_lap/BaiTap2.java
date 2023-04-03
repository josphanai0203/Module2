package vong_lap;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class BaiTap2 {
	public static boolean isPrime(int number) {
		if (number < 0 || number == 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("nhap so luong so can in :");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int count = 0;
		int i = 1;
		while(count != length) {
			if(isPrime(i)) {
				count+=1;
				System.out.print(i + " ");
				i++;
			}else {
				i++;
			}
		}
		
	}
}
