package mang;

import java.util.Scanner;

public class BaiTap7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[5][5];
		generatorArray(array);
		System.out.println("Giá trị đường chéo chính : "+ sumMainDiagonal(array));

	}

	public static int sumMainDiagonal(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j == i) {
					sum += array[i][j];
				}
			}

		}
		return sum;
	}

	public static void generatorArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) Math.floor(Math.random() * 9 + 1);
			}

		}
		printArray(array);
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
