package bruteForce;

import java.util.Scanner;

public class BruteForce_1182 {
	public static int[] arr;
	public static int n, s, count;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		count = 0;
		n = scan.nextInt();
		s = scan.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		cal(0, 0);
		if(s == 0) {
			count -= 1;
		}
		System.out.println(count);
	}
	public static void cal(int index, int result) {
		if(index == n) {
			if(result == s) {
				count++;
			}
			return;
		}
		cal(index+1, result+arr[index]);
		cal(index+1, result);
	}
}
