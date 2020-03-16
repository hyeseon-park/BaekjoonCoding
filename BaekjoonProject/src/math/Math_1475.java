package math;

import java.util.Scanner;

public class Math_1475 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		scan.close();
		int[] num = new int[10];
		for(int i=0; i<n.length(); i++) {
			num[n.charAt(i)-'0'] += 1;
		}
		int k = num[6]+num[9];
		if(k%2 == 0) {
			num[6]=k/2;
			num[9]=k/2;
		} else {
			num[6]=k/2+1;
			num[9]=k/2+1;
		}
		int max = 0;
		for(int count : num) {
			if(max<=count) max = count;
		}
		System.out.println(max);
	}
}
