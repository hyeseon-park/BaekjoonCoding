package dfsBfs;

import java.util.Scanner;

public class DfsBfs_10451 {
   static int[] arr;
   static boolean[] visited;
   static int n;
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int testCase = scan.nextInt();
      int cnt;
      for(int i = 0; i < testCase; i++) {
         n = scan.nextInt(); 
         cnt = 0;
         arr = new int[n+1]; 
         visited = new boolean[n+1];
         for(int j = 1; j < n+1; j++) {
        	 arr[j] = scan.nextInt();        	 
         }
         for(int j = 1; j < n+1; j++) {
            if(!visited[j]) {
            	cnt += dfs(j);
            }
         }
         System.out.println(cnt);
      }
   }
   public static int dfs(int i) {
      if(i == arr[i] || visited[i]) {
    	  return 1;
      }
      visited[i] = true;
      return dfs(arr[i]);
   }
}