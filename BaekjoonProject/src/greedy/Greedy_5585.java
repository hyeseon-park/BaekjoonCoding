package greedy;

import java.util.Scanner;

public class Greedy_5585 { //거스름돈
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int n = scan.nextInt();
		n = 1000-n;
		
		count += n/500;
		n = n%500;
		
		count += n/100;
		n = n%100;
		
		count += n/50;
		n = n%50;
		
		count += n/10;
		n = n%10;
		
		count += n/5;
		n = n%5;
		
		count += n/1;
		n = n%1;
		System.out.println(count);
	}
}
