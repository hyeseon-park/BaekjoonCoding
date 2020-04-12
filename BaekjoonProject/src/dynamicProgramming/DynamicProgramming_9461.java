package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_9461 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long[] padovan = new long[101];
		padovan[1] = 1;
		padovan[2] = 1;
		for(int j=3; j<padovan.length; j++) {
			padovan[j] = padovan[j-2] + padovan[j-3]; 
		}
		
		int testCase = scan.nextInt();
		for(int i=0; i<testCase; i++) {
			int n = scan.nextInt();
			System.out.println(padovan[n]);
		}
		scan.close();
	}
}