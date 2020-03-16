package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2217 { //로프
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int maxWeight = 0;
		//모든 로프를 사용해야 할 필요는 없으며, 임의로 몇 개의 로프를 골라서 사용해도 된다.
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr); //오름차순
		for(int i=n-1; i>=0; i--) {
			if(maxWeight<arr[i]*(n-i)) {
				maxWeight=arr[i]*(n-i);
			}
		}
		System.out.println(maxWeight);
	}
}
