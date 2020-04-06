package bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class BruteForce_15686 {
	static ArrayList<Spot> home;
	static ArrayList<Spot> chicken;
	static int minimumSum;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		home = new ArrayList<Spot>();
		chicken = new ArrayList<Spot>();
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int type = scan.nextInt();
				if (type == 1) {
					home.add(new Spot(i, j));
				}
				if (type == 2) {
					chicken.add(new Spot(i, j));
					count++;
				}
			}
		}
		scan.close();

		minimumSum = Integer.MAX_VALUE;
		int[] arr = new int[m];
		chooseChicken(arr, count, m, 0, 0);

		System.out.println(minimumSum);
	}

	static void chooseChicken(int[] arr, int n, int r, int index, int target) {
		if (r == 0) {
			Spot[] threeChicken = new Spot[index];
			for (int i = 0; i < index; i++) {
				threeChicken[i] = chicken.get(arr[i]);
			}
			findChicken(threeChicken);
			return;
		} else if (n == target)
			return;

		arr[index] = target;
		chooseChicken(arr, n, r - 1, index + 1, target + 1);
		chooseChicken(arr, n, r, index, target + 1);
	}

	static void findChicken(Spot[] threeChicken) {
		int sum = 0;

		for (int i = 0; i < home.size(); i++) {
			Spot homeSpot = home.get(i);
			int minDistance = Integer.MAX_VALUE;

			for (int j = 0; j < threeChicken.length; j++) {
				Spot chickenSpot = threeChicken[j];

				int distance = findDistance(homeSpot, chickenSpot);
				if (distance < minDistance)
					minDistance = distance;
			}
			sum += minDistance;
		}
		if (sum < minimumSum)
			minimumSum = sum;
	}

	static int findDistance(Spot home, Spot chicken) {
		return Math.abs(home.x - chicken.x) + Math.abs(home.y - chicken.y);
	}
}

class Spot {
	int x;
	int y;

	Spot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
