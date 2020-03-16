package math;

import java.util.Scanner;

public class Math_1978 {
	public static void main(String[] args) { //소수 찾기
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i=0; i<n; i++) {
			int num = scan.nextInt(); // 1 3 5 7
			boolean isPrime = true;
			for(int j=2; j<num; j++) {
				if(num%j==0) {
					isPrime = false;
					break;
				}
			}
			if(num == 1) {
				isPrime = false;
			}
			if(isPrime) {				
				count++;
			}
		}
		System.out.println(count);
	}
}
