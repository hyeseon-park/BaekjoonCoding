package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_1026 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		for (int i = 0; i < n; i++) {
			arrA[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrB[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(arrA);
		Arrays.sort(arrB);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arrA[i] * arrB[n - i - 1];
		}
		System.out.println(sum);
	}
}
