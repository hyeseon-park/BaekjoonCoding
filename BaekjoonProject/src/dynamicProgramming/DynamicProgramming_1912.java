package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1912 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] numbers = new int[n];
		int max = numbers[0] = scan.nextInt();
		for (int i = 1; i < n; i++) {
			int num = scan.nextInt();
			numbers[i] = Math.max(num, numbers[i - 1] + num);
			if (max < numbers[i]) max = numbers[i];
		}
		scan.close();
		
		System.out.println(max);
	}
}
