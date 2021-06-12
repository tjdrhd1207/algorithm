package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon2638 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		
		int cheese = 0;
		int arr[][] = new int[N][M];
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				arr[i][j] = sc.nextInt();
				if(arr[i][j]==1){
					cheese++;
				}
			}
		}
		
		
		while(true){
			for(int i=1; i<N; i++){
				for(int j=1; j<M; j++){
					if(arr[i-1][j]==0){
						
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
