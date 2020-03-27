package bruteForce;

import java.util.Scanner;

public class BruteForce_1182 {
	public static int num, sum, count;
	public static int[] sequence;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		sum = scan.nextInt();
		sequence = new int[num];
		for (int i = 0; i < num; i++) {
			sequence[i] = scan.nextInt();
		}
		scan.close();

		getSubsequence(0, 0);
		if (sum == 0)
			count -= 1;

		System.out.println(count);
	}

	public static void getSubsequence(int index, int result) {
		if (index == num) {
			if (result == sum) {
				count++;
			}
			return;
		}
		getSubsequence(index + 1, result + sequence[index]);
		getSubsequence(index + 1, result);
	}
}
