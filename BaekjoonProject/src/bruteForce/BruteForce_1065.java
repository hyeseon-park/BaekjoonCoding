package bruteForce;

import java.util.Scanner;

public class BruteForce_1065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int n = scan.nextInt();
		scan.close();

		for (int i = 1; i <= n; i++) {
			if (i < 100) {
				count++;
			} else if (i < 1000) {
				int num1 = i / 100 % 10;
				int num2 = i / 10 % 10;
				int num3 = i % 10;
				if (num2 * 2 == num1 + num3) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
