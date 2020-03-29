package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_11052 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] prices = new int[n + 1];
		int[] accum = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			prices[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 1; i <= n; i++) {
			int maxPrice = 0;
			for (int j = 1; j < i; j++) {
				int tmpPrice = accum[i - j] + prices[j];
				if (maxPrice < tmpPrice) {
					maxPrice = tmpPrice;
				}
			}
			accum[i] = Math.max(prices[i], maxPrice);
		}

		System.out.println(accum[n]);
	}
}
