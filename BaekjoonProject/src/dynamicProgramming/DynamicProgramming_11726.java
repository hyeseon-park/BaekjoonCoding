package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_11726 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.close();

		int[] tiles = new int[n + 1];
		tiles[0] = 1;
		tiles[1] = 1;
		for (int i = 2; i <= n; i++) {
			tiles[i] = tiles[i - 1] + tiles[i - 2];
			tiles[i] %= 10007;
		}

		System.out.println(tiles[n]);
	}
}
