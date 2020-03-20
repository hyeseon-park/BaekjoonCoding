package bruteForce;

import java.util.Scanner;

public class BruteForce_1018 {
	static String[] chessBoard = {"WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", 
			"WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW"};
	static String[] strArr;
	static int n, m, count, tmpCount;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		count = Integer.MAX_VALUE;
		n = scan.nextInt(); //10
		m = scan.nextInt(); //13
		scan.nextLine();
		String[] strArr = new String[n];
		for(int i=0; i<n; i++) {
			strArr[i] = scan.nextLine();
		}
		for(int i=0; i<=n-8; i++) { //0~2
			for(int j=0; j<=m-8; j++) { //0~5
				tmpCount = 0;
				for(int k=0; k<8; k++) {
					String tmpStr = strArr[i+k].substring(j, j+8);
					for(int l=0; l<8; l++) {
						if(tmpStr.charAt(l) == chessBoard[k].charAt(l)) {
							tmpCount++;
						}
					}
				}
				if(tmpCount >= 32) {
					tmpCount = 64 - tmpCount;
				}
				count = Math.min(count, tmpCount);
			}
		}
		System.out.println(count);
	}
}
