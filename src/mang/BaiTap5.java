package mang;

import java.util.Scanner;

public class BaiTap5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử mảng :");
		int length = sc.nextInt();
		int[] array = new int[length];
		enterArray(array);
		System.out.println("Min Value : "+ findMin(array));
		
	}
	public static int findMin(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
	public static void enterArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Nhập phần tử A[" + i + "] = ");
			array[i] = sc.nextInt();
		}
		System.out.println();
	}
	public static void printArray(int[] array) {
		System.out.print("Array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
