package search;

import java.util.Scanner;

public class Search_1436 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.close();

		int count = 1;
		int num = 666;

		while (count != n) {
			num++;
			if (Integer.toString(num).contains("666")) {
				count++;
			}
		}

		System.out.println(num);
	}
}
