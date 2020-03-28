package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2217 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] weights = new int[n];
		int maxWeight = 0;
		for (int i = 0; i < n; i++) {
			weights[i] = scan.nextInt();
		}
		scan.close();
		
		Arrays.sort(weights);
		for (int i = n - 1; i >= 0; i--) {
			if (maxWeight < weights[i] * (n - i)) {
				maxWeight = weights[i] * (n - i);
			}
		}
		
		System.out.println(maxWeight);
	}
}
