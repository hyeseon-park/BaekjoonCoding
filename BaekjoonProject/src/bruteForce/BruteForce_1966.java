package bruteForce;

import java.util.LinkedList;
import java.util.Scanner;

public class BruteForce_1966 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();
		for (int i = 0; i < testCase; i++) {
			LinkedList<int[]> queue = new LinkedList<int[]>();
			int n = scan.nextInt();
			int m = scan.nextInt();
			int count = 0;

			for (int j = 0; j < n; j++) {
				queue.add(new int[] { j, scan.nextInt() });
			}

			while (!queue.isEmpty()) {
				int[] now = queue.poll();
				boolean able = true;
				for (int[] q : queue) {
					if (q[1] > now[1]) {
						able = false;
					}
				}
				if (able) {
					count++;
					if (now[0] == m) {
						break;
					}
				} else {
					queue.add(now);
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}
