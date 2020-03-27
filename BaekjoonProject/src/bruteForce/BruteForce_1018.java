package bruteForce;

import java.util.Scanner;

public class BruteForce_1018 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] chessBoard = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW" };
		int minimumCount = Integer.MAX_VALUE;
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.nextLine();
		String[] board = new String[n];
		for (int i = 0; i < n; i++) {
			board[i] = scan.nextLine();
		}
		scan.close();
		
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int count = 0;
				for (int k = 0; k < 8; k++) {
					String oneLine = board[i + k].substring(j, j + 8);
					for (int l = 0; l < 8; l++) {
						if (oneLine.charAt(l) == chessBoard[k].charAt(l)) {
							count++;
						}
					}
				}
				if (count >= 32) count = 64 - count;
				minimumCount = Math.min(minimumCount, count);
			}
		}
		
		System.out.println(minimumCount);
	}
}
