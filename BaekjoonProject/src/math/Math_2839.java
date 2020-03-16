package math;

import java.util.Scanner;

public class Math_2839 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //6
		int count = 0;
		if(n%5==0) {
			count = n/5;
		} else {
			int start = n/5; //1
			while(start>=0) {				
				int tmpN = n-(5*start); //6-5 == 1 
				if(tmpN%3==0) {
					count = start+tmpN/3;
					break;
				} else {
					start -= 1;
				}
			}
		}
		if(count == 0) {
			count = -1;
		}
		System.out.println(count);
	}
}
