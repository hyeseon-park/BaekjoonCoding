package bruteForce;

import java.util.Scanner;

public class BruteForce_7568 { //덩치
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][2];
		int[] rank = new int[n];
		for(int i=0; i<n; i++) {
			arr[i][0] = scan.nextInt();
			arr[i][1] = scan.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					rank[i] += 1;
				} else if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1]) {
					rank[j] += 1;
				} 
			}
		}
		for(int tmp : rank) {			
			System.out.print(tmp+1+" ");
		}
	}
}
