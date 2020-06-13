package greedy;

import java.util.Scanner;

public class Greedy_1120 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();

		int answer = 50;

		if (a.length() > b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		
		int gap = Math.abs(a.length() - b.length());
		int length = Math.min(a.length(), b.length());
		
		for (int i = 0; i <= gap; i++) {
			int count = 0;
			for (int j = 0; j < length; j++) {
				if (a.charAt(j) != b.charAt(j + i)) {
					count++;
				}
			}
			if (count < answer) answer = count;
		}
		
		System.out.println(answer);
	}
}
