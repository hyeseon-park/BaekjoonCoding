package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_1427 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int[] arr = new int[n.length()];
		for(int i=0; i<n.length(); i++) {
			arr[i] = n.charAt(i)-'0';
		}
		for(int i=0; i<n.length()-1; i++) {
			for(int j=i+1; j<n.length(); j++) {				
				if(arr[i]<arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		String ans = "";
		for(int tmp : arr) {
			ans += tmp;
		}
		System.out.print(ans);
	}
}
