package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_2193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		solution(n);
		long[][] nArr = new long[n+1][2];
		nArr[1][0] = 0; //0
		nArr[1][1] = 1; //1
		for(int i=2; i<=n; i++) {
			nArr[i][0] = nArr[i-1][0]+nArr[i-1][1];
			nArr[i][1] = nArr[i-1][0];
		}
		System.out.println(nArr[n][0]+nArr[n][1]);
	} 
	static void solution(int n) {
		long[] arr = new long[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<=n; i++) {			
			arr[i] = arr[i-1]+arr[i-2];
		}
		System.out.println(arr[n]);
	}
}