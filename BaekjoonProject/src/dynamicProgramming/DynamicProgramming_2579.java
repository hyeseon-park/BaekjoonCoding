package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_2579 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int stair = scan.nextInt();
		int[] stairs = new int[stair + 1];
		int[] accum = new int[stair + 1];
		for (int i = 1; i <= stair; i++) {
			stairs[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 1; i <= stair; i++) {
			if (i == 1) {
				accum[1] = stairs[1];
			} else if (i == 2) {
				accum[2] = stairs[2] + stairs[1];
			} else {
				int noJump = stairs[i] + stairs[i - 1] + accum[i - 3];
				int jump = stairs[i] + accum[i - 2];
				accum[i] = Math.max(noJump, jump);
			}
		}

		System.out.println(accum[stair]);
	}
}
