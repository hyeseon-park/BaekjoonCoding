package bruteForce;

import java.util.Scanner;

public class BruteForce_2231 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int answer = 0;
		for(int i=n; i>=1; i--) {	
			int tmpNum = i + sum(i);
			if(n == tmpNum) {
				answer = i;
			}
		}
		System.out.println(answer);
	}
	public static int sum(int n) {
		int sum = 0;
		while(n >= 1) {
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
}
