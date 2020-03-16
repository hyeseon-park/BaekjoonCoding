package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_1463 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int[] arr = new int[x+1];
		arr[1] = 0;
		for(int i=2; i<=x; i++) {			
			int case1 = 1000000;
			int case2 = 1000000;
			int case3 = 1000000;
			if(i%3==0) {
				case1 = arr[i/3]+1;
			} 
			if(i%2==0) {
				case2 = arr[i/2]+1;
			} 
			if(i-1!=0){
				case3 = arr[i-1]+1;
			}
			arr[i] = Math.min(case1, Math.min(case2, case3));
		}
		System.out.println(arr[x]);
	}
}
