package search;

import java.util.Scanner;

public class Search_1024 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sum = scan.nextInt();
		int length = scan.nextInt();
		scan.close();

		boolean flag = true;

		for (int i = length; i <= 100 && flag; i++) {
			if ((2 * sum >= i * (i - 1)) && (2 * sum - i * (i - 1)) % (2 * i) == 0) {
				int start = ((2 * sum - i * (i - 1)) / (2 * i));
				for (int j = start; j < start + i; j++) {
					System.out.print(j + " ");
				}
				flag = false;
			}
		}
		if (flag) {
			System.out.println(-1);
		}
	}
}
