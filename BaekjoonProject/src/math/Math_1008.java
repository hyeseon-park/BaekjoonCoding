package math;

import java.util.Scanner;

public class Math_1008 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		scan.close();
		System.out.println(a/(double)b);
	}
}
