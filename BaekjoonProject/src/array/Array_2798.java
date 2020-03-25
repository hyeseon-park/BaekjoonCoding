package array;

import java.util.Scanner;

public class Array_2798 {
	static int[] allCards;
	static int n, m;
	static int sum;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		allCards = new int[n];
		int[] cards = new int[3];

		for (int i = 0; i < n; i++) {
			allCards[i] = scan.nextInt();
		}
		scan.close();
		sum = 0;
		chooseThreeCards(cards, n, 3, 0, 0);
		System.out.println(sum);
	}

	public static void chooseThreeCards(int[] cards, int n, int r, int index, int target) {
		if (r == 0) {
			int sumOfThreeCards = 0;
			for (int i = 0; i < index; i++) {
				sumOfThreeCards += allCards[cards[i]];
			}
			if (sumOfThreeCards <= m) {
				if (sumOfThreeCards > sum) {
					sum = sumOfThreeCards;
				}
			}
		} else if (target == n) {
			return;
		} else {
			cards[index] = target;
			chooseThreeCards(cards, n, r - 1, index + 1, target + 1);
			chooseThreeCards(cards, n, r, index, target + 1);
		}
	}
}
