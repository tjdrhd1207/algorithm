package da.DongbinNa;

import java.util.Arrays;
import java.util.Scanner;

public class FloydSample {

	public static final int INF = (int)1e9;
	
	public static int n,m;
	
	public static int[][] graph = new int[501][501];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		
		//최단거리 테이블을 모두 무한으로 초기화
		for(int i=0; i<501; i++){
			Arrays.fill(graph[i], INF);
		}
		
		//자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화
		for(int a=1; a<=n; a++){
			for(int b=1; b<=n; b++){
				if(a==b){
					graph[a][b] = 0;
			   }
			}
		}
		
		
		//각 간선에 대한 정보를 입력 받아, 그 값으로 초기화
		for(int i=0; i<m; i++){
			//A에서  B로 가는 비용은 C라고 설정
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			graph[a][b] = c;
		}
		
		//점화식에 따라 플로이드 워셜 알고리즘을 수행
		for(int k=1; k<=n; k++){
		 for(int a=1; a<=n; a++){	
		   for(int b=1; b<=n; b++){
			  graph[a][b] = Math.min(graph[a][b], graph[a][k]+graph[k][b]);
		    }
	      }
		}	
		
	
		for(int a=1; a<=n; a++){
			for(int b=1; b<=n; b++){
				
				if(graph[a][b] == INF){
					System.out.print("INFINITY");
				}else{
					System.out.print(graph[a][b]+" ");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

}
