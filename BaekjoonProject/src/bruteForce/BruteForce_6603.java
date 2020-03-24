package bruteForce;

import java.util.Scanner;

public class BruteForce_6603 {
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {			
			int k = scan.nextInt();
			arr = new int[k];
			int[] tmpArr = new int[k];
			for(int i=0; i<k; i++) {
				arr[i] = scan.nextInt();
			}
			chooseSix(tmpArr, k, 6, 0, 0);
			System.out.println();
			if(k == 0) break;
		}
		scan.close();
	}
	
	public static void chooseSix(int[] tmpArr, int n, int r, int index, int target) {
		if(r == 0) {
			for(int i=0; i<6; i++) {
				System.out.print(arr[tmpArr[i]]+" ");
			}
			System.out.println();
		} else if(target == n) {
			return;
		} else {
			tmpArr[index] = target;
			chooseSix(tmpArr, n, r-1, index+1, target+1);
			chooseSix(tmpArr, n, r, index, target+1);
		}
	}
}
