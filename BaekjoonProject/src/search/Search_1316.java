package search;

import java.util.Scanner;

public class Search_1316 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<n; i++) {
			boolean[] alphabet = new boolean[26];
			String str = scan.nextLine();
			
			alphabet[str.charAt(0)-'a'] = true;
			for(int j=1; j<str.length(); j++) {	
				if(str.charAt(j-1)!=str.charAt(j)) {
					if(!alphabet[str.charAt(j)-'a']) {
						alphabet[str.charAt(j)-'a'] = true;
					} else {
						count++;
						break;
					}
				}
			}
		}
		scan.close();
		
		System.out.println(n-count);
	}
}
