package greedy;

import java.util.Scanner;

public class Greedy_11047 { //동전 0
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int n = scan.nextInt(); //10
		int k = scan.nextInt(); //4200
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=n-1; i>=0; i--) {
			if(arr[i] <= k) {
				count += k/arr[i];
				k = k%arr[i];
			}
		}
		System.out.println(count);
	}
}
