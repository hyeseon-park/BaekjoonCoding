package simulation;

import java.util.Scanner;

public class Simulation_1094 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();

		int count = 0;
		int stick = 64;
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = stick;
			stick /= 2;
		}

		for (int i = 0; i < arr.length; i++) {
			if (x % arr[i] == 0) {
				count++;
				break;
			} else if (x >= arr[i]) {
				x -= arr[i];
				count++;
			}
		}

		System.out.println(count);
	}
}
