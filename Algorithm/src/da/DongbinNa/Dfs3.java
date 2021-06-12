package da.DongbinNa;

import java.util.Scanner;

public class Dfs3 {
	
	public static int N,M;
	public static int[][] graph = new int[1000][1000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		 N = sc.nextInt();
		 M = sc.nextInt();
		
		sc.nextLine();
		
		char arr[][] = new char[N][M];
		//String[] str = new String[N];
		
		
		
		for(int i=0; i<N; i++){
			String str = sc.nextLine();
			for(int j=0; j<M; j++){
				graph[i][j]=str.charAt(j)-'0';
			}
		}
		
		boolean visit[][] = new boolean[N+1][M+1];
		
		//방문안한걸 false로 초기화
		for(int i=0; i<visit.length; i++){
			for(int j=0; j<visit[0].length; j++){
				visit[i][j]=false;
			}
		}
		
		int result = 0;
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				//현재 위치에서 DFS 수행
				if(dfs(i,j)){
					System.out.println("i값 "+i+", j값 "+j);
					result+=1;
				}
			}
		}
	System.out.println(result);
		
	
	}

	public static boolean dfs(int x, int y){
		//주어진 범위 벗어나는 경우 종료		
		if( x <= -1 || x>=N || y<= -1 || y>=M){
			return false;
		}
		//현재 노드를 아직 방문하지 않았다면
		if(graph[x][y] ==0){
			//해당 노드 방문 처리
			graph[x][y] = 1;
			//상,하,좌,우의 위치들도 모두 재귀적으로 호출
			dfs(x-1,y);//상
			dfs(x+1,y);//하
			dfs(x,y-1);//좌
			dfs(x,y+1);//우
			return true;
		}
		
		return false;
	}
	
}
