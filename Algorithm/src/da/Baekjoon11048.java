package da;

import java.util.Scanner;

public class Baekjoon11048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int array[][] = new int[n+1][m+1];
		int CandyMap[][] = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				array[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				CandyMap[i][j] += Math.max(CandyMap[i-1][j],CandyMap[i][j-1])+array[i][j];
				System.out.println(CandyMap[i][j]+"CandyMap["+i+"]"+"["+j+"]");
			}
		}
		
		
	}

}
