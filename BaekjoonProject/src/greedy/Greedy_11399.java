package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_11399 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int n = scan.nextInt();
		int[] time = new int[n];
		for (int i = 0; i < n; i++) {
			time[i] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(time);
		for (int i = 0; i < n; i++) {
			sum += time[i] * (n - i);
		}
		System.out.println(sum);
	}
}
