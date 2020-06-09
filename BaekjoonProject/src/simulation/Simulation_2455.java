package simulation;

import java.util.Scanner;

public class Simulation_2455 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int people = 0;
		
		for (int i = 0; i < 4; i++) {
			int out = scan.nextInt();
			int in = scan.nextInt();
			people -= out;
			people += in;

			if (people > max) {
				max = people;
			}
		}
		scan.close();
		
		System.out.println(max);
	}
}
