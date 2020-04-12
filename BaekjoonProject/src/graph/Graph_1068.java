package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph_1068 {
	static int n;
	static int start;
	static int target;
	static int count = 0;
	@SuppressWarnings("unchecked")
	static ArrayList<Integer>[] tree = new ArrayList[51];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		for (int i = 0; i < 51; i++) {
			tree[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < n; i++) {
			int parent = scan.nextInt();
			if (parent == -1) {
				start = i;
			} else {
				tree[parent].add(i);
			}
		}

		target = scan.nextInt();
		scan.close();

		delete();

		if (target != start) {
			search(start);
			System.out.println(count);
		} else {
			System.out.println(0);
		}
	}

	static void delete() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < tree[i].size(); j++) {
				if (tree[i].get(j) == target) {
					tree[i].remove(j);
				}
			}
		}
	}

	static void search(int index) {
		if (tree[index].size() == 0) {
			count++;
			return;
		}
		for (int i = 0; i < tree[index].size(); i++) {
			int child = tree[index].get(i);
			if (tree[index].size() == 1 & child == target) {
				count++;
				return;
			}
			if (child < n && child != target) {
				search(child);
			}
		}
	}
}