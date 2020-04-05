package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_10828 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Stack<Integer> stack = new Stack<Integer>();
		int n = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < n; i++) {
			String[] order = scan.nextLine().split(" ");

			switch (order[0]) {

			case "push":
				stack.push(Integer.parseInt(order[1]));
				break;

			case "pop":
				if (stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
				break;

			case "size":
				System.out.println(stack.size());
				break;

			case "empty":
				if (stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;

			case "top":
				if (stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
				break;

			default:
				break;
			}
		}
		scan.close();
	}
}
