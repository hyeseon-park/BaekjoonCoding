package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Greedy_10610 { //30
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer = -1;
		String n = scan.next();
		scan.close();
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n.length(); i++) {
			sum += n.charAt(i)-'0';
			list.add(n.charAt(i)-'0');
		}
		
		Collections.sort(list);
		if(sum %3 == 0 && list.get(0)==0) {
			for(int i=list.size()-1; i>=0; i--) {				
				System.out.print(list.get(i));
			}
		} else {			
			System.out.println(answer);
		}
	}
}
