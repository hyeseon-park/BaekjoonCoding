package bruteForce;

import java.util.Scanner;

public class BruteForce_14501 { //Dynamic Programming

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //1 <= n <= 15
		int[][] arr = new int[n+2][2];
		int[] ans = new int[n+2];
		
		for(int i=1; i<=n; i++) {
			arr[i][0] = scan.nextInt(); //T
			arr[i][1] = scan.nextInt(); //P
		}
		
		for(int i=n; i>0; i--) {
			int day = i+arr[i][0];
			if(day <= n+1) {
				ans[i] = Math.max(arr[i][1]+ans[day], ans[i+1]);
			} else { //상담일 초과
				ans[i] = ans[i+1];
			}
		}
		System.out.println(ans[1]);
	}
}
