package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_10844 { //쉬운 계단 수
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //2
		long[][] arr = new long[n+1][11]; //0~9 10개, 10
		for(int i=1; i<=9; i++) {
			arr[1][i] = 1; //i로 끝나는 1자리 숫자가 1개. arr[1][10]=0
		}
		for(int i=2; i<=n; i++) {
			arr[i][0] = arr[i-1][1]; //0으로 끝나는 i자리 숫자 개수 = 1로 끝나는 i-1자리 숫자 개수
			for(int j=1; j<=9; j++) {
				arr[i][j] = (arr[i-1][j-1]+arr[i-1][j+1])%1000000000;
			}
		}
		long sum = 0;
		for(int i=0; i<=9; i++) {
			sum += arr[n][i];
		}
		System.out.println(sum%1000000000);
	}
	public static void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //2
		long[] arr = new long[n+1];
		arr[1] = 9;
		for(int i=2; i<=n; i++) {
			arr[i] = ((arr[i-1]-(i-1))*2+(i-1))%1000000000;
		}
		System.out.println(arr[n]);
	}
}

