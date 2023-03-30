package mang;

import java.util.Scanner;

public class BaiTAp6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[10][10];
		generatorArray(array);
		System.out.println("Nhap cột bạn muốn tính tổng :");
		int col = sc.nextInt();
		System.out.println("Gia tri cột " + col + " = " +sumCol(col, array));
		
	}
	public static int sumCol(int col ,int[][] array) {
		int sum = 0;
		for(int i = 0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(j == col) {
					sum += array[i][j];
				}
			}
			
		}
		return sum;
	}
	public static void generatorArray(int[][] array) {
		for(int i = 0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]= (int) Math.floor(Math.random()*100 +1);
			}
			
		}
		printArray(array);
	}
	public static void printArray(int[][] array) {
		for(int i = 0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
