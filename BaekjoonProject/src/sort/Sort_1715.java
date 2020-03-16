package sort;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Sort_1715 {
	public static void main(String[] args) {
		int ans = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=0; i<N; i++) {
			pq.offer(scan.nextInt());
		}
		while(pq.size() != 1) {
			int p = pq.poll();
		    int q = pq.poll();
		    ans += p + q;
		    pq.offer(p + q);
		}
		System.out.println(ans);
	}
}
