package mang;

import java.util.Scanner;
import javax.net.ssl.SSLEngine;

public class BaiTap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử mảng :");
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Nhập phần tử A[" + i + "] = ");
			array[i] = sc.nextInt();
		}
		printArray(array);
		System.out.println("Nhập Giá trị muốn xóa :");
		int deleteValue = sc.nextInt();
		if (search(deleteValue, array)) {
			delete(deleteValue, array);
			System.out.println("Đã Xóa");
			printArray(array);
		} else {
			System.out.println("Không tồn tại giá trị cần xóa");
		}

	}

	public static void printArray(int[] array) {
		System.out.print("Array : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static boolean search(int x, int[] array) {
		for (int i : array) {
			if (i == x) {
				return true;
			}
		}
		return false;
	}

	public static void delete(int value, int[] array) {
		boolean isDelete = false;
		for (int i = 0; i < array.length; i++) {
			if (isDelete) {
				if (i == array.length - 1) {
					array[i] = 0;
				} else {

					array[i] = array[i + 1];
				}
			} else {
				if (array[i] == value) {
					if (i == array.length - 1) {
						array[i] = 0;
					} else {

						array[i] = array[i + 1];
						isDelete = true;
					}
				}

			}
		}
	}
}
