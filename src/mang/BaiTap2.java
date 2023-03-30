package mang;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mảng có 10 phần tử");
		System.out.println("Số lượng phần tử muốn thêm giá trị (n<=10):");
		int n = sc.nextInt();
		int[] array = new int[10];
		if(n<0 || n>10) {
			System.out.println("Wrong Input");
		}{
			
			for (int i = 0; i < n; i++) {
				System.out.println("Nhập phần tử A[" + i + "] = ");
				array[i] = sc.nextInt();
			}
			printArray(array);
		}
		System.out.println("Nhập giá vị trí cần thêm : ");
		int indexAdd = sc.nextInt();
		if(indexAdd<0 || indexAdd>10) {
			System.out.println("Wrong Input");
		}else {
			System.out.println("Nhập giá trị cần thêm :");
			int value = sc.nextInt();
			add(value, indexAdd,array);
			printArray(array);
		}
	}
	public static void add(int value,int indexAdd,int[] array) {
		for(int i = array.length -1;i>=indexAdd;i--) {
			if(i == indexAdd){
				array[i] = value;
			}else {
				
				array[i] = array[i-1];
			}
		}
	}
	public static void printArray(int[] array) {
		System.out.print("Array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static boolean search(int x, int[] array) {
		for (int i : array) {
			if (i == x) {
				return true;
			}
		}
		return false;
	}
}
