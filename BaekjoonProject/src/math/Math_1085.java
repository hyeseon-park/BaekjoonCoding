package math;

import java.util.Scanner;

public class Math_1085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 1000;
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		if(x<min) {
			min=x;
		}
		if(y<min) {
			min=y;
		}
		if(w-x<min) {
			min=w-x;
		}
		if(h-y<min) {
			min=h-y;
		}
		System.out.println(min);
	}
}
