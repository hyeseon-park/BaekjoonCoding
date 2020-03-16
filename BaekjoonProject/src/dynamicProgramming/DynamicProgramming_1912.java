package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1912 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int max = arr[0] = scan.nextInt();
		for(int i=1; i<n; i++) {
			int num = scan.nextInt();
			arr[i] = Math.max(num, arr[i-1]+num);
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
