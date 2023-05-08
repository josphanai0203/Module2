package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		try {
			System.out.println("Nhap canh tam giac 1:");
			a = sc.nextDouble();
			System.out.println("Nhap canh tam giac 2:");
			b = sc.nextDouble();
			System.out.println("Nhap canh tam giac 3:");
			c = sc.nextDouble();
			if(a<=0 || b<=0 || c<=0) {
				throw new ArithmeticException();
			}
			if(a+b<c || a+c<b ||b+c <a) {
				throw new IllegalTriangleException();
			}
			
		} catch (IllegalTriangleException e) {
			System.out.println("3 canh khong phai la canh tam giac");
		}catch (ArithmeticException e) {
			System.out.println("Nhap sai dau vao");
		}catch ( InputMismatchException  e) {
			System.out.println("Nhap sai dau vao");
		}
	}
}
