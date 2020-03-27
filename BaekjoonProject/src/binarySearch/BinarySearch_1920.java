package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_1920 {
	static int n;
	static int m;
	static int[] nArr;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		nArr = new int[n];
		for (int i = 0; i < n; i++) {
			nArr[i] = scan.nextInt();
		}
		Arrays.sort(nArr);
		m = scan.nextInt();
		for (int i = 0; i < m; i++) {
			System.out.println(binarySearch(nArr, scan.nextInt()));
		}
		scan.close();
	}

	public static int binarySearch(int[] nArr, int target) {
		int high = nArr.length - 1;
		int low = 0;
		while (high >= low) {
			int mid = (high + low) / 2;
			if (nArr[mid] == target) {
				return 1;
			} else if (nArr[mid] > target) {
				high = mid - 1;
			} else if (nArr[mid] < target) {
				low = mid + 1;
			}
		}
		return 0;
	}
}