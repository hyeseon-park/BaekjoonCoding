package dynamicProgramming;

import java.util.Scanner;

public class DynamicProgramming_2579 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stair = scan.nextInt();
		int[] stairs = new int[stair+1];
		int[] newStairs = new int[stair+1];
		for(int i=1; i<=stair; i++) {
			stairs[i] = scan.nextInt();
		}
		for(int i=1; i<=stair; i++) { //2가지 방법이 있음	
			if(i==1) {
				newStairs[1] = stairs[1];
			} else if(i==2) {
				newStairs[2] = stairs[2] + stairs[1];
			} else {	
				int noJump = stairs[i]+stairs[i-1]+newStairs[i-3]; //1계단 전+3계단 전까지의 누적
				int jump = stairs[i]+newStairs[i-2]; //2계단 전까지의 누적
				newStairs[i] = Math.max(noJump, jump); //2가지 방법을 비교해서 큰 쪽으로
			}
		}
		System.out.println(newStairs[stair]);
	}
}
