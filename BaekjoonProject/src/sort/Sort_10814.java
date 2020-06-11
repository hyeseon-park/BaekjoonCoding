package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_10814 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[][] arr = new String[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = scan.next();
			arr[i][1] = scan.next();
		}
		scan.close();

		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1].compareTo(o2[1]);
				}
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
