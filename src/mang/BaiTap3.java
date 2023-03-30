package mang;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử mảng 1 :");
		int length1 = sc.nextInt();
		int[] array1 = new int[length1];
		enterArray(array1);
		printArray(array1);
		System.out.println("Nhập số lượng phần tử mảng 2 :");
		int length2 = sc.nextInt();
		int[] array2 = new int[length2];
		enterArray(array2);
		printArray(array2);
		concat(array1, array2);
		
	}
	public static void concat(int[] array1 ,int[] array2) {
		int newLength = array1.length + array2.length;
		int[] newArray = new int[newLength];
		for(int i = 0;i < array1.length;i++) {
			newArray[i] = array1[i];
		}
		for(int i = 0;i < array2.length;i++) {
			newArray[i + array1.length] = array2[i];
		}
		printArray(newArray);
	}
	public static void printArray(int[] array) {
		System.out.print("Array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void enterArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Nhập phần tử A[" + i + "] = ");
			array[i] = sc.nextInt();
		}
		System.out.println();
	}
}
