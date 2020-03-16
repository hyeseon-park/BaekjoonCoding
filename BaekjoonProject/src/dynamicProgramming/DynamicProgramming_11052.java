package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_11052 { //카드 구매하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n+1];
		int[] accum = new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=1; i<=n; i++) {
			int max = 0;
			for(int j=1; j<i; j++) {
				int tmpPrice = accum[i-j]+arr[j];
				if(max<tmpPrice) {
					max = tmpPrice;
				}
			}
			accum[i] = Math.max(arr[i], max);
		}
		System.out.println(accum[n]);
	}
}
