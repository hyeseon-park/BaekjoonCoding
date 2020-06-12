package dfsBfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsBfs_1697 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		scan.close();

		int[] arr = new int[100001];
		Arrays.fill(arr, -1);

		System.out.println(bfs(n, k, arr));
	}

	public static int bfs(int n, int k, int[] arr) {
		int nextN = n;
		int[] status = new int[3];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(nextN);
		arr[nextN] = 0;

		while (!q.isEmpty() && nextN != k) {
			nextN = q.poll();

			status[0] = nextN - 1;
			status[1] = nextN + 1;
			status[2] = nextN * 2;

			for (int i = 0; i < 3; i++) {
				if (status[i] >= 0 && status[i] <= 100000) {
					if (arr[status[i]] == -1) {
						q.add(status[i]);
						arr[status[i]] = arr[nextN] + 1;
					}
				}
			}
		}

		return arr[k];
	}
}
