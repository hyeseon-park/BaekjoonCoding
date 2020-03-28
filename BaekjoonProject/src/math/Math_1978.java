package math;

import java.util.Scanner;

public class Math_1978 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			boolean isPrime = true;

			if (num == 1) {
				isPrime = false;
			}
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
			}
		}
		scan.close();

		System.out.println(count);
	}
}
