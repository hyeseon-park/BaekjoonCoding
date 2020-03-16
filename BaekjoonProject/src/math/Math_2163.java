package math;

import java.util.Scanner;

public class Math_2163 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		System.out.println((n-1)+((m-1)*n));
	}
}
