package bruteForce;

import java.util.Scanner;

public class BruteForce_14501 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int days = scan.nextInt();
		int[][] schedule = new int[days + 2][2];
		int[] profit = new int[days + 2];

		for (int i = 1; i <= days; i++) {
			schedule[i][0] = scan.nextInt();
			schedule[i][1] = scan.nextInt();
		}
		scan.close();

		for (int i = days; i > 0; i--) {
			int day = i + schedule[i][0];
			if (day <= days + 1) {
				profit[i] = Math.max(schedule[i][1] + profit[day], profit[i + 1]);
			} else {
				profit[i] = profit[i + 1];
			}
		}
		System.out.println(profit[1]);
	}
}
