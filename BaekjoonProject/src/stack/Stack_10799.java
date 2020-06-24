package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_10799 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Stack<Character> stack = new Stack<Character>();
		String bracket = scan.next();
		scan.close();

		int count = 0;
		for (int i = 0; i < bracket.length(); i++) {
			char b = bracket.charAt(i);

			if (b == '(') {
				stack.push(b);
			} else if (b == ')') {
				if (stack.peek() == '(') {
					stack.pop();
					count += stack.size();
				} else {
					stack.pop();
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
