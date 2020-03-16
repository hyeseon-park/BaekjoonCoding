package bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class BruteForce_2309 { //combination
	static int[] nine = new int[9];
	static int[] seven = new int[7];
	static boolean isFirst = true;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0; i<9; i++) {
			nine[i] = scan.nextInt();
		}
		combination(arr, 9, 7, 0, 0); //9개 중 7개
	}
	public static void combination(int[] comArr, int n, int r, int index, int target) {
		if(!isFirst) {
			return;
		}
		if(r == 0) {
			int sum = 0;
			for(int i=0; i<index; i++) {
				seven[i] = nine[comArr[i]];
				sum += seven[i]; 
			}
			
			if(sum == 100) {
				Arrays.sort(seven);
				for(int tmp : seven) {
					System.out.println(tmp);
				}
				isFirst = false;
			}
			
		} else if(target == n) {
			return;
		} else { //처음 들어오는 곳
			comArr[index] = target; 
			combination(comArr, n, r-1, index+1, target+1); //
			combination(comArr, n, r, index, target+1);
			//반복 후에 comArr는 0부터 6까지의 숫자가 들어가있음
		}
	}
}
