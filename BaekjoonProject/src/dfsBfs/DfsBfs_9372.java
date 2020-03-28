package dfsBfs;

import java.util.Scanner;

public class DfsBfs_9372 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();
		for (int i = 0; i < testCase; i++) {
			int nations = scan.nextInt();
			int planes = scan.nextInt();
			for (int j = 0; j < planes; j++) {
				scan.nextInt();
				scan.nextInt();
			}
			System.out.println(nations - 1);
		}
		scan.close();
	}
}
