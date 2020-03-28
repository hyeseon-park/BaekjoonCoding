package greedy;

import java.util.Scanner;

public class Greedy_2875 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int girl = scan.nextInt();
		int boy = scan.nextInt();
		int internship = scan.nextInt();
		scan.close();

		int team = 0;
		for (int i = 0; i <= boy; i++) {
			int left = girl - i * 2;
			if (left + (boy - i) >= internship && left >= 0) {
				team = i;
			}
		}

		System.out.println(team);
	}
}
