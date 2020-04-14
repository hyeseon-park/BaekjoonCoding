package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1010 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();
		for (int i = 0; i < testCase; i++) {
			int west = scan.nextInt();
			int east = scan.nextInt();
			int[][] arr = new int[east + 1][west + 1];

			arr[1][0] = 1;
			arr[1][1] = 1;
			for (int j = 2; j <= east; j++) {
				arr[j][0] = 1;
				for (int k = 1; k <= west; k++) {
					arr[j][k] = arr[j - 1][k - 1] + arr[j - 1][k];
				}
			}

			System.out.println(arr[east][west]);
		}
		scan.close();
	}
}
