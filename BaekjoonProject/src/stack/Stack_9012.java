package stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_9012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < t; i++) {
			Stack<String> stack = new Stack<String>();
			String str = scan.nextLine();

			for (int j = 0; j < str.length(); j++) {
				if (stack.size() != 0 && stack.peek().equals("(") && (Character.toString(str.charAt(j)).equals(")"))) {
					stack.pop();
				} else {
					stack.add(Character.toString(str.charAt(j)));
				}
			}

			if (stack.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		scan.close();
	}
}
