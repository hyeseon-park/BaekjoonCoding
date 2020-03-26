package bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class BruteForce_2309 {
	static int[] sevenDwarfs = new int[7];
	static int[] nineDwarfs = new int[9];
	static int[] arr = new int[7];
	static boolean isFirst = true;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<9; i++) {
			nineDwarfs[i] = scan.nextInt();
		}
		scan.close();
		combination(9, 7, 0, 0);
	}
	
	public static void combination(int n, int r, int index, int target) {
		if(!isFirst) {
			return;
		}
		if(r == 0) {
			int sum = 0;
			for(int i=0; i<index; i++) {
				sevenDwarfs[i] = nineDwarfs[arr[i]];
				sum += sevenDwarfs[i]; 
			}
			if(sum == 100) {
				Arrays.sort(sevenDwarfs);
				for(int dwarf : sevenDwarfs) {
					System.out.println(dwarf);
				}
				isFirst = false;
			}
		} else if(target == n) {
			return;
		} else {
			arr[index] = target; 
			combination(n, r-1, index+1, target+1);
			combination(n, r, index, target+1);
		}
	}
}
