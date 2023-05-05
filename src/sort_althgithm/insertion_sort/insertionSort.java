package sort_althgithm.insertion_sort;

import java.util.Arrays;

public class insertionSort {
	public static void insertionSort(int[] list) {
		int n = list.length;
		for (int i = 1; i < n; i++) {
			int key = list[i];
			int j = i - 1;
			while (j >= 0 && list[j] > key) {
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = key;
		}
	}
}
