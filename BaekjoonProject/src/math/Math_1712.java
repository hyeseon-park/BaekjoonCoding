package math;

import java.util.Scanner;

public class Math_1712 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(b >= c) {
			System.out.println(-1);
		} else {
			System.out.println(a/(c-b)+1);
		}
	}
}
