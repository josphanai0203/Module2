package dsa_stack_queue.check_expression;

import java.util.Scanner;
import java.util.Stack;

public class CheckExpression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		System.out.println("Nhập biểu thức :");
		String str = sc.nextLine();
		String[] expressionArr = str.split("");
		boolean check = true;
		for(int i = 0;i < expressionArr.length;i++) {
			if(expressionArr[i].equalsIgnoreCase("(")) {
				stack.push(expressionArr[i]);
			}
			if(expressionArr[i].equalsIgnoreCase(")")) {
				if(stack.isEmpty()) {
					check=false;
					break;
				}else {
					stack.pop();
				}
			}
			
		}
		if(check) {
			if(stack.isEmpty()) {
				System.out.println("Well Expression");
			}else {
				System.out.println("Wrong Expression");
			}
		}else {
			System.out.println("Wrong Expression");
		}
		sc.close();
	}
}
