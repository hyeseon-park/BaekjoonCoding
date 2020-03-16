package greedy;

import java.util.Scanner;

public class Greedy_2875 { //30
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //여
		int m = scan.nextInt(); //남
		int k = scan.nextInt(); //인턴
		int max = 0;
		for(int i=0; i<=m; i++) { //0~3
			int tmpN = n - i*2; //6-4 =0
			if(tmpN+(m-i)>=k && tmpN>=0) {
				max = i;
			}
		}
		System.out.println(max);
	}
}

// 6 3 2
// 3 6 2
