package bruteForce;

import java.util.Scanner;

public class BruteForce_2231 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.close();

		int answer = 0;
		for (int i = n; i >= 1; i--) {
			int decomposition = i + getSum(i);
			if (n == decomposition) {
				answer = i;
			}
		}
		
		System.out.println(answer);
	}

	public static int getSum(int n) {
		int sum = 0;
		while (n >= 1) {
			sum += n % 10;
			n = n / 10;
		}
		System.out.println(sum);
		return sum;
	}
}
