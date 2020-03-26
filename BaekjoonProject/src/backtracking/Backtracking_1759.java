package backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class Backtracking_1759 {
	static int length, count;
	static String[] alphabet;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		length = scan.nextInt();
		count = scan.nextInt();
		scan.nextLine();
		alphabet = scan.nextLine().split(" ");
		Arrays.sort(alphabet);
		scan.close();
		
		solve(0, "");
	}

	static void solve(int index, String password) {
		if (password.length() == length) {
			if(checkAlphabet(password)) {
				System.out.println(password);
			}
			return;
		} 
		if (index >= count) {
			return;
		}
		solve(index+1, password+alphabet[index]);
		solve(index+1, password);
	}
	
	static boolean checkAlphabet(String password) {
		int vowel = 0;
		int consonant = 0;
		
		for(int i=0; i<password.length(); i++) {
			if(checkVowel(password.charAt(i))) {
				vowel++;
			} else {
				consonant++;
			}
		}
		return vowel >= 1 && consonant >= 2;
	}
	
	static boolean checkVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
