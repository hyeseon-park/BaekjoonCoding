package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_2193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int digit = scan.nextInt();
		scan.close();
		
		long[][] pinaryNum = new long[digit + 1][2];
		pinaryNum[1][0] = 0;
		pinaryNum[1][1] = 1;
		for (int i = 2; i <= digit; i++) {
			pinaryNum[i][0] = pinaryNum[i - 1][0] + pinaryNum[i - 1][1];
			pinaryNum[i][1] = pinaryNum[i - 1][0];
		}

		System.out.println(pinaryNum[digit][0] + pinaryNum[digit][1]);
	}
}