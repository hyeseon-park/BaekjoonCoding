package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_10844 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long sum = 0;
		int length = scan.nextInt();
		scan.close();

		long[][] arr = new long[length + 1][11];
		for (int i = 1; i <= 9; i++) {
			arr[1][i] = 1;
		}
		for (int i = 2; i <= length; i++) {
			arr[i][0] = arr[i - 1][1];
			for (int j = 1; j <= 9; j++) {
				arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1]) % 1000000000;
			}
		}

		for (int i = 0; i <= 9; i++) {
			sum += arr[length][i];
		}

		System.out.println(sum % 1000000000);
	}
}
