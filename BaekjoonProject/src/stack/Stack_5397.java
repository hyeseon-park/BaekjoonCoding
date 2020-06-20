package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_5397 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			String pw = scan.next();
			Stack<Character> stack1 = new Stack<Character>();
			Stack<Character> stack2 = new Stack<Character>();

			for (int j = 0; j < pw.length(); j++) {
				char str = pw.charAt(j);

				if (str == '<') {
					if (!stack1.isEmpty()) {
						stack2.add(stack1.pop());
					}
				} else if (str == '>') {
					if (!stack2.isEmpty()) {
						stack1.push(stack2.pop());
					}
				} else if (str == '-') {
					if (!stack1.isEmpty()) {
						stack1.pop();
					}
				} else {
					stack1.push(str);
				}
			}

			while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}

			StringBuilder sb = new StringBuilder();
			for (char c : stack1) {
				sb.append(c);
			}
			System.out.println(sb);
		}
		scan.close();
	}
}
