package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_10799 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		scan.close();

		int count = 0;
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char bracket = str.charAt(i);

			if (bracket == '(') {
				stack.push(bracket);
			} else if (bracket == ')') {
				stack.pop();
				
				if (str.charAt(i-1) == '(') {
					count += stack.size();
				} else {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
