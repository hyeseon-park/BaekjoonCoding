package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Greedy_1931 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[][] time = new int[n][2];
		int count = 0;

		for (int i = 0; i < n; i++) {
			time[i][0] = scan.nextInt();
			time[i][1] = scan.nextInt();
		}
		scan.close();

		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});

		int end = -1;
		for (int i = 0; i < n; i++) {
			if (time[i][0] >= end) {
				end = time[i][1];
				count++;
			}
		}

		System.out.println(count);
	}
}
