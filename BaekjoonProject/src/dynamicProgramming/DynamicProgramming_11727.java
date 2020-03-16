package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_11727 { //2xn 타일링 2
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] tiles = new int[n+1];	
		for(int i=1; i<=n; i++) {
			if(i==1) {
				tiles[1] = 1;
			} else if(i==2) {
				tiles[2] = 3;
			} else {				
				tiles[i] = (tiles[i-1]+tiles[i-2]*2)%10007;
			}
		}
		System.out.println(tiles[n]);
	}
}
