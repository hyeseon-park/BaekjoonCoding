package math;

import java.util.Scanner;

public class Math_1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int next = -1;
		int count = 0;
		while(n!=next) {
			if(count==0) {				
				next = n; //처음
			}
			next = (next%10)*10 + ((next/10+next%10)%10);
			count++;
		}
		System.out.println(count);
	}
}
