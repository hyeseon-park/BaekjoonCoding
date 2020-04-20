package search;

import java.util.Scanner;

public class Search_1100 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		for (int i = 0; i < 8; i++) {
			String line = scan.nextLine();
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0 && line.charAt(j) == 'F') {
					count++;
				}
			}
		}
		scan.close();
		System.out.println(count);
	}
}
