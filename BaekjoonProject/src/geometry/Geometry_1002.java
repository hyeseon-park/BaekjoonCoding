package geometry;

import java.util.Scanner;

public class Geometry_1002 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();
		for (int i = 0; i < testCase; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();

			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();

			double distance = Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			} else if (distance > (r1 + r2) || distance < Math.abs(r1 - r2) || (x1 == x2 && y1 == y2 && r1 != r2)) {
				System.out.println(0);
			} else if (distance == (r1 + r2) || distance == Math.abs(r1 - r2)) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}
		scan.close();
	}
}
