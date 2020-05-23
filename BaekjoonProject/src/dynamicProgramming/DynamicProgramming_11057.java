package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_11057 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.close();

		int count = 0;
		int[][] arr = new int[n + 1][10];

		for (int i = 0; i < 10; i++) {
			arr[1][i] = 1;
		}

		for (int j = 2; j <= n; j++) {
			arr[j][0] = arr[j - 1][0];
			for (int i = 1; i < 10; i++) {
				arr[j][i] = arr[j - 1][i] + arr[j][i - 1];
				arr[j][i] %= 10007;
			}
		}

		for (int i = 0; i < 10; i++) {
			count += arr[n][i] % 10007;
		}

		System.out.println(count % 10007);
	}
}
