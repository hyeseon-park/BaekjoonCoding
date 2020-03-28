package sort;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Sort_1715 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int count = 0;
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			pq.offer(scan.nextInt());
		}
		scan.close();

		while (pq.size() != 1) {
			int p = pq.poll();
			int q = pq.poll();
			count += p + q;
			pq.offer(p + q);
		}
		System.out.println(count);
	}
}
