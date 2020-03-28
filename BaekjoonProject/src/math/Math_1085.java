package math;

import java.util.Scanner;

public class Math_1085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int minimum = 1000;
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		scan.close();

		if (x < minimum) {
			minimum = x;
		}
		if (y < minimum) {
			minimum = y;
		}
		if (w - x < minimum) {
			minimum = w - x;
		}
		if (h - y < minimum) {
			minimum = h - y;
		}
		
		System.out.println(minimum);
	}
}
