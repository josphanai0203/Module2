package mang;

import java.util.Scanner;

public class BaiTap4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng hàng :");
		int row = sc.nextInt();
		System.out.println("Nhập số lượng cột :");
		int column = sc.nextInt();
		int[][] array = new int[row][column];
		for(int i = 0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("Array["+i+"]["+j+"] = ");
				array[i][j]= sc.nextInt();
			}
		}
		printArray(array);
		System.out.println("Max Array = "+ findMax(array));
		
	}
	public static int findMax(int[][] array) {
		int max = 0;
		for(int i = 0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j] >max) {
					max = array[i][j];
				}
			}
		}
		return max;
	}
	public static void printArray(int[][] array) {
		for(int i = 0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
