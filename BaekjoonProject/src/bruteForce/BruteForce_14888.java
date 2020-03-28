package bruteForce;

import java.util.Scanner;

public class BruteForce_14888 {
	public static int n;
	public static int[] num;
	public static int[] operator = new int[4];
	public static int min = Integer.MAX_VALUE;
	public static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			operator[i] = scan.nextInt();
		}
		scan.close();

		cal(1, num[0]);
		System.out.println(max);
		System.out.println(min);
	}

	public static void cal(int index, int result) {
		if (index == n) {
			min = Math.min(min, result);
			max = Math.max(max, result);
			return;
		}
		if (operator[0] > 0) {
			operator[0]--;
			cal(index + 1, result + num[index]);
			operator[0]++;
		}
		if (operator[1] > 0) {
			operator[1]--;
			cal(index + 1, result - num[index]);
			operator[1]++;
		}
		if (operator[2] > 0) {
			operator[2]--;
			cal(index + 1, result * num[index]);
			operator[2]++;
		}
		if (operator[3] > 0) {
			operator[3]--;
			cal(index + 1, result / num[index]);
			operator[3]++;
		}
	}
}
