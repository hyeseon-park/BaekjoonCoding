package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicProgramming_11053 { //가장 긴 증가하는 부분 수열
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] count = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			count[i] = 1;
		}
		count[0] = 1;
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j]) {
					count[i] = Math.max(count[j]+1, count[i]);
				}
			}
		}
		Arrays.sort(count);
		System.out.println(count[n-1]);
	}
}
