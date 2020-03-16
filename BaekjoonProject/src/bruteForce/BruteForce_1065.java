package bruteForce;

import java.util.Scanner;

public class BruteForce_1065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // <= 1000
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(i<100) {
				count++;
			} else if(i<1000) {				
				int num1 = i/100%10; //세번째 자리
				int num2 = i/10%10; //두번째 자리 
				int num3 = i%10; //첫번째 자리
				if(num2*2 == num1+num3) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
