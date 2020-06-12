package sort;

import java.util.Scanner;

public class Sort_2751 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();

		quickSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	static void quickSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}

		int pivot = getPivot(arr, left, right);

		quickSort(arr, left, pivot - 1);
		quickSort(arr, pivot + 1, right);
	}

	static int getPivot(int[] arr, int left, int right) {
		int mid = (left + right) / 2;
		swap(arr, left, mid);

		int pivot = arr[left];
		int i = left, j = right;

		while (i < j) {
			while (pivot < arr[j]) {
				j--;
			}
			while (i < j && pivot >= arr[i]) {
				i++;
			}
			swap(arr, i, j);
		}

		arr[left] = arr[i];
		arr[i] = pivot;
		return i;
	}

	static void swap(int[] arr, int a, int b) {
		int temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}
}
