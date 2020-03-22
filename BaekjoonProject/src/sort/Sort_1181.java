package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_1181 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) {
					return 1; 
				} else if(o1.length() < o2.length()) {
					return -1;
				} else {
					return o1.compareTo(o2);
				}
			}
		}); 
		System.out.println(arr[0]);
		for(int i=1; i<n; i++) {
			if(arr[i-1].equals(arr[i])) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
}
