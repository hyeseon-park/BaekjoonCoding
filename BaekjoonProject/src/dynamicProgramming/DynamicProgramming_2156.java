package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_2156 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] wines = new int[n + 1];
		int[] accum = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			wines[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				accum[i] = wines[i];
			} else if (i == 2) {
				accum[i] = wines[i - 1] + wines[i];
			} else {
				accum[i] = Math.max(accum[i - 1],
						Math.max(accum[i - 2] + wines[i], accum[i - 3] + wines[i - 1] + wines[i]));
			}
		}

		System.out.println(accum[n]);
	}
}
