package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon1010 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		//test케이스
		int test = sc.nextInt();
		
		
		for(int i=0; i<test; i++){
		int x =sc.nextInt();
		int y =sc.nextInt();
		
		int dp[][]=new int[x+1][y+1];
		
		for(int n=2; n<=x; n++){
			dp[n][1]=0;
		}
		
		
		for(int m=1; m<=y; m++){
			dp[1][m]=m;
		}
		
		
		for(int j=2; j<=x; j++){
			for(int k=2; k<=y; k++){
				
				dp[j][k]=dp[j][k-1]+dp[j-1][k-1];
				
			}
		}
		
		
		System.out.println(dp[x][y]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
