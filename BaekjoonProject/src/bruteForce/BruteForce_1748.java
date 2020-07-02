package bruteForce;

import java.util.Scanner;

public class BruteForce_1748 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		scan.close();

		int length = n.length();
		int num = Integer.parseInt(n);
		int count = 0;
		int nine = 9;
		for(int i =1; i<length; i++) {
			count += nine*i;
			nine *= 10;
		}
		count += length*(num-Math.pow(10, length-1)+1);
		
		System.out.println(count);
	}
}
