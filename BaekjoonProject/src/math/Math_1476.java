package math;

import java.util.Scanner;

public class Math_1476 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int e = scan.nextInt();
		int s = scan.nextInt();
		int m = scan.nextInt();
		scan.close();

		int year = 1;
		while (true) {
			if ((year - e) % 15 == 0) {
				if ((year - s) % 28 == 0) {
					if ((year - m) % 19 == 0) {
						break;
					}
				}
			}
			year++;
		}

		System.out.println(year);
	}
}
