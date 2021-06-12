package da.DongbinNa;

import java.util.Scanner;

public class DynamicProgramming5 {
	
		public static int[] dp = new int[101];
	
		
	public static int dp(int arr[], int m){
		
		for(int i=1; i<dp.length; i++){
			dp[i] = 10001;
		}
		
		
		for(int i=0; i<arr.length; i++){
			for(int j=arr[i]; j<=m; j++){
				if(dp[j-arr[i]] != 10001){
					dp[j]=Math.min(dp[j], dp[j-arr[i]]+1);
				}
			}
		}
		
		if(dp[m]!=10001){
			return dp[m];
		}
		else {
			return -1;	
		}
		
		
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(dp(arr, m));
	}

}
