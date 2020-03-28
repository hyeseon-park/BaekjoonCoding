package greedy;

import java.util.Scanner;

public class Greedy_5585 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		int money = scan.nextInt();
		scan.close();

		money = 1000 - money;

		count += money / 500;
		money = money % 500;

		count += money / 100;
		money = money % 100;

		count += money / 50;
		money = money % 50;

		count += money / 10;
		money = money % 10;

		count += money / 5;
		money = money % 5;

		count += money / 1;
		money = money % 1;

		System.out.println(count);
	}
}
