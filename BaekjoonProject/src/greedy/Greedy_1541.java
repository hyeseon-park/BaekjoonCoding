package greedy;

import java.util.Scanner;

public class Greedy_1541 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int minimun = 0;
		String expression = scan.next();
		scan.close();

		String[] exPart = expression.split("\\-");
		for (int i = 0; i < exPart.length; i++) {
			int result = add(exPart[i]);

			if (i == 0) result *= -1;
			minimun -= result;
		}

		System.out.println(minimun);
	}

	static int add(String expression) {
		int sum = 0;
		for (String num : expression.split("\\+")) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}
}
