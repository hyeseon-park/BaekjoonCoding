package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_11399 { //ATM
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i]*(n-i);
		}
		System.out.println(sum);
	}
}
