package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_2156 { //포도주 시식
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n+1];
		int[] accum = new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=1; i<=n; i++) {
			if(i==1) {
				accum[i] = arr[i];				
			} else if(i==2) {
				accum[i] = arr[i-1]+arr[i];
			} else {				
				accum[i] = Math.max(accum[i-1], Math.max(accum[i-2]+arr[i], accum[i-3]+arr[i-1]+arr[i])); 
			}
		} //마지막 잔을 꼭 마셔야한다는 규칙이 없음. 예를 들어 6번째 잔을 마시면 최대값이 32지만 안 마시면 33임
		System.out.println(accum[n]);
	}
}
