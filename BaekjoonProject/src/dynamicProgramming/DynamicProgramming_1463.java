package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1463 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		scan.close();

		int[] counts = new int[num + 1];
		counts[1] = 0;
		for (int i = 2; i <= num; i++) {
			int division3 = 1000000; 
			int division2 = 1000000;
			int subtraction1 = 1000000; 
			if (i % 3 == 0) {
				division3 = counts[i / 3] + 1;
			}
			if (i % 2 == 0) {
				division2 = counts[i / 2] + 1;
			}
			if (i - 1 != 0) {
				subtraction1 = counts[i - 1] + 1;
			}
			counts[i] = Math.min(division3, Math.min(division2, subtraction1));
		}

		System.out.println(counts[num]);
	}
}
