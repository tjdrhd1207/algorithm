package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Programmers_네트워크 {
	static ArrayList<Character> arr = new ArrrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		//String str = br.readLine();
		
		//StringTokenizer st = new StringTokenizer(str," ");
		
		int computers[][] = new int[n][n];
		
		for(int i=0; i<computers.length; i++){
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			for(int j=0; j<computers[0].length; j++){
				computers[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<computers.length; i++){
			for(int j=0; j<computers[0].length; j++){
				System.out.print(computers[i][j]+" ");
			}
			System.out.println();
		}
		
		solution(n, computers);
		
	}
	public static int solution(int n, int[][] computers){
		int answer = 0;
		boolean[] check = new boolean[n]; //n갯수만큼 boolean 배열을 만들고 모든 요소를 false로
		
		for(int i=0; i<n; i++){
			if(check[i]!=false){
				dfs(computers, i, check);
				answer++;
			}
		}
		
		
		
		
		return answer;
	}

	public static boolean[] dfs(int[][] computers, int i, boolean[] check){
		check[i] = true;
		
		for(int j=0; j < computers.length; j++){
			if(i != j && computers[i][j] == 1 && check[j] == false){
				check = dfs(computers, j , check);                   
			}
		}
		
		
		return check;
	}
	
	
}
