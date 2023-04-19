package dsa_stack_queue.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
	public static void main(String[] args) {
		Stack<String> stringStack = new Stack<String>();
		Queue<String> queue = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi cần kiểm tra:");
		String stringCheck = sc.nextLine();
		String[] strArray = stringCheck.split("");
		boolean check = true;
		for(int i = 0;i<strArray.length;i++) {
			stringStack.push(strArray[i]);
			queue.offer(strArray[i]);
		}
		for(int i = 0;i<strArray.length/2;i++) {
			String checkStack = stringStack.pop();
			String checkSqueue = queue.poll();
			
			if(!checkStack.equals(checkSqueue)) {
				check = false;
			}
		}
		if(check==true) {
			System.out.println("palindrome : True");
		}else {
			System.out.println("palindrome : False");
		}
		sc.close();
	}
}
