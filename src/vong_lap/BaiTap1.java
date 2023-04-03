package vong_lap;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class BaiTap1 {
	public static void inHinhChuNhat(int chieuDai, int chieuRong) {
		for (int i = 0; i < chieuRong; i++) {
			for (int j = 0; j < chieuDai; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

public static void inTamGiacVuong() {
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	for (int i = 4;i>=0; i--) {
		for (int j = 0; j <5; j++) {
			if(j>=i) {
				System.out.print("*");				
			}else {
				System.out.print(" ");	
			}
		}
		System.out.println();
	}
	System.out.println();
	for (int i = 0;i<5; i++) {
		for (int j = 0; j <5; j++) {
			if(j>=i) {
				System.out.print("*");				
			}else {
				System.out.print(" ");	
			}
		}
		System.out.println();
	}
	System.out.println();
	for (int i = 0;i<5; i++) {
		for (int j = 4; j >=0; j--) {
			if(j>=i) {
				System.out.print("*");				
			}else {
				System.out.print(" ");	
			}
		}
		System.out.println();
	}
	
}
public static void inTamGiacCan(int chieuCao) {
	for(int i = 0;i<chieuCao;i++) {
		for(int j =0;j<chieuCao+i;j++) {
			if(j+i >= chieuCao-1) {
				System.out.print("*");				
			}else {
				System.out.print(" ");	
			}
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		while (true) {
			do {
				System.out.println("========= MENU ==============");
				System.out.println("1.In Hinh Chu Nhat");
				System.out.println("2.In Hinh Tam Giac Vuong");
				System.out.println("3.In Hinh Tam Giac Can");
				System.out.println("4.Thoat");
				System.out.println("========= END ==============");
				System.out.println("Nhap lua Chon :");
				option = sc.nextInt();
			} while (option <= 0 || option > 4);
			if (option == 4) {
				System.out.println("BYE");
				break;
			}
			switch (option) {
			case 1:
				System.out.print("Nhap chieu dai:");
				int chieuDai = sc.nextInt();
				System.out.println("Nhap chieu rong:");
				int chieuRong = sc.nextInt();
				inHinhChuNhat(chieuDai, chieuRong);
				break;
			case 2:
				inTamGiacVuong();
				break;
			case 3:
				System.out.print("Nhap chieu cao:");
				int chieuCao = sc.nextInt();
				inTamGiacCan(chieuCao);
				break;

			default:
				break;
			}
		}
	}
}
