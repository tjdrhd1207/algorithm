package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1463 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		
		int dp[] = new int[N+3];
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i=4; i<=N; i++){
			int min = Integer.MAX_VALUE;
			
			
			 if(i%3 == 0){
				//dp[i] = Math.min(dp[i/3]+1, dp[i]);
				min = Math.min(min, dp[i/3]+1);
			}
			 if(i%2 == 0){
				//dp[i] = Math.min(dp[i/2]+1, dp[i]);
				 min = Math.min(min, dp[i/2]+1);
			}
			
			
			dp[i] = Math.min(dp[i-1] + 1,min);
				
				
				
			
		}
		
		
		System.out.println(dp[N]);
	
	}
	
	

}
