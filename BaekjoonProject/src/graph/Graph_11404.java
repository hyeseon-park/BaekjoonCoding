package graph;

import java.util.Scanner;

public class Graph_11404 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] prices = new int[n+1][n+1];
		for(int i=0; i<m; i++) {
			int a = scan.nextInt(); //시작 도시
			int b = scan.nextInt(); //도착 도시
			int c = scan.nextInt(); //비용
			if(prices[a][b] == 0) {
				prices[a][b] = c;
			} else {
				prices[a][b] = Math.min(c, prices[a][b]);
			}
		}
		scan.close();
		
		for(int mid = 1; mid <= n; mid++) {
			for(int start = 1; start <= n; start++) {
				if(prices[start][mid] == 0) continue;
				for(int end = 1; end <= n; end++) {
					if(prices[mid][end] == 0 || start == end) continue; 
					if(prices[start][end] == 0 || 
							prices[start][end] > prices[start][mid] + prices[mid][end]) {
						prices[start][end] = prices[start][mid] + prices[mid][end];
					}
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {				
				System.out.print(prices[i][j]+" ");
			}
			System.out.println();
		}
	}
}
