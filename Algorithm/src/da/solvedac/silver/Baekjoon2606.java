package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon2606 {

	static int n,n2;
	static int cnt;
	static int visited[];
	static int[][] map;
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
	
		
		 n = sc.nextInt();
		
		 n2 = sc.nextInt();
		
		
		 map = new int[n+1][n+1];
		
		 visited = new int[n+1];
		
		
		for(int i=0; i<n2; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = map[b][a] = 1;
		}
	
	
		dfs(1);
		System.out.println(cnt);
	
	
	
	
	}
	static void dfs(int start){
		
		visited[start] = 1;
		
		
		for(int i=1; i<n2+1; i++){
			
			if(map[start][i] == 1 && visited[i] == 0){
				dfs(i);
				cnt++;
			}
		}
	}

}
