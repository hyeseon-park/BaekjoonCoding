package binarySearch;

import java.util.Scanner;

public class BinarySearch_2022 {
	static double x;
	static double y;
	static double c;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		x = scan.nextDouble();
		y = scan.nextDouble();
		c = scan.nextDouble();
		scan.close();
		if(x<y) {
			double tmp = x;
			x = y;
			y = tmp;
		}
		double l = 0; //최소값
		double r = y; //최대값
		while(true) { //binary search
			double d = (l+r)/2; //중간값
			double tmpC = binarySearch(d);
			if(Math.abs(tmpC-c)<=0.001) {
				System.out.printf("%.3f", d);
				return;
			}
			if(tmpC > c) {
				l = d;
			} else if(tmpC < c) {
				r = d;
			}
		}
	}
	public static double binarySearch(double d) { 
		double hx = Math.sqrt(x*x-d*d); 
		double hy = Math.sqrt(y*y-d*d);
		return (hx*hy)/(hx+hy);
	}
}