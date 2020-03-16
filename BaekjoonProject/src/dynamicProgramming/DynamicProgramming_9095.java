package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_9095 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[11];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		int testCase = scan.nextInt();
		for(int i=0; i<testCase; i++) {
			int n = scan.nextInt();
			for(int j=4; j<=n; j++) {			
				arr[j] = arr[j-1]+arr[j-2]+arr[j-3];
			}
			System.out.println(arr[n]);
		}
	}
}

