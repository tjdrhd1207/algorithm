package da;

import java.util.Scanner;

public class Baekjoon11722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int dp[][]=new int[n][2];
		
		int max=1;
		
		for(int i=0; i<n; i++){ 
			dp[i][0]= sc.nextInt();
			dp[i][1]=1;
			
			for(int j=0; j<i ; j++){
				if(dp[j][0]>dp[i][0]){
					dp[i][1] = Math.max(dp[j][1],dp[j][1]+1);
				}
				
			}
			
			
		}
	
	}

}
