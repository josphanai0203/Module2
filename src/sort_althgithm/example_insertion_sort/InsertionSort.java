package sort_althgithm.example_insertion_sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 4, 9, 15, 2, 33,12,21,5 };
		System.out.println("Mảng chưa sắp xếp: " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Mảng đã sắp xếp: " + Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
			System.out.println("Bước " + i + ": " + Arrays.toString(arr));
		}
	}

}
