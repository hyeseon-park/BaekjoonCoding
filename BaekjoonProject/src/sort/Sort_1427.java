package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort_1427 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String number = scan.next();
		scan.close();

		Integer[] arr = new Integer[number.length()];
		for (int i = 0; i < number.length(); i++) {
			arr[i] = number.charAt(i) - '0';
		}

		Arrays.sort(arr, Collections.reverseOrder());

		for (int digit : arr) {
			System.out.print(digit);
		}
	}
}
