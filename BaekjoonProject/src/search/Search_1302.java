package search;

import java.util.HashMap;
import java.util.Scanner;

public class Search_1302 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int n = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < n; i++) {
			String bookName = scan.nextLine();
			if (map.containsKey(bookName)) {
				map.put(bookName, map.get(bookName) + 1);
			} else {
				map.put(bookName, 1);
			}
		}
		scan.close();

		int max = 0;
		String bookName = "";

		for (String key : map.keySet()) {
			int value = map.get(key);
			if (value > max) {
				max = value;
				bookName = key;
			} else if (value == max && bookName.compareTo(key) > 0) {
				max = value;
				bookName = key;
			}
		}
		
		System.out.println(bookName);
	}
}
