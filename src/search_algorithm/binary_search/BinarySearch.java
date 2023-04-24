package search_algorithm.binary_search;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi số (mỗi phần tủ cách nhau bởi dấu \',\' ) :");
		String[] strArr = sc.nextLine().split(",");
		int[] intArr = new int[strArr.length];
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(intArr);
		System.out.println("Nhập giá trị cần tìm : ");
		int value = Integer.parseInt(sc.nextLine());
		int result = binarySearch(intArr, intArr[0], intArr[intArr.length-1], value);
		if(result == -9999) {
			System.out.println("Không tồn tại giá trị");
		}else {
			System.out.println("Tìm thấy : " + result);
		}
	}
	public static int binarySearch(int[] array, int left, int right ,int value) {
		if(left > right) {
			return -9999;
		}else {
			
			int midle = (left + right)/2;
			if(midle == value) {
				return midle;
			}else if(midle < value) {
				return binarySearch(array,midle +1,right,value);
			}else{
				return binarySearch(array,left,midle-1,value);
			}
		}
	}
}
