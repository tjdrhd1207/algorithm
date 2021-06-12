package da.Programmers;

import java.util.Scanner;

public class intTriangle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int x=sc.nextInt();
		
		
		int triangle[][]= new int [x][x];
		
		//int dp[][] = new int [x][y];
		
		for(int i=0;i<x; i++){
			for(int j=0; j<=i; j++){
				triangle[i][j]=sc.nextInt();
			}
			
		}
		
		
		int max = 0;
		
		max=solution(triangle);
		System.out.println(max);
		
	}

	
	public static int solution(int[][] triangle){
		
		int answer=0;
		
		int dp[][]=new int[triangle.length][triangle.length];
		
		dp[0][0]=triangle[0][0];
		
		
		  for(int i=1;i<triangle.length; i++){ 
			  for(int j=0; j<=i; j++){
				  
			 if(j==0){
				 dp[i][j]=dp[i-1][0]+triangle[i][j]; 
		  //	 System.out.print(dp[i][j]+" ");
			 }
			 else if(j==i){
				 dp[i][j]=dp[i-1][j-1]+triangle[i][j]; 
		  //	 System.out.print(dp[i][j]+" ");
			 }
		  else {
		  dp[i][j]=Math.max(dp[i-1][j-1]+triangle[i][j],dp[i-1][j]+triangle[i][j]);
		  //	System.out.println(dp[i][j]+" "); 
		  		}
			 }
		  
		  }
		 
		
      
        
    /* dp[0][0] = triangle[0][0];
     for(int i = 1; i < triangle.length; i++) {
        dp[i][0] = dp[i - 1][0] + triangle[i][0]; 
        dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];
     }
      
     // 2. 동적계획법 //
     for(int i = 2; i < triangle.length; i++) 
        for(int j = 1; j < i; j++) 
           dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
      */
        
        
   int max = 0;
     for(int i = 0; i < dp.length; i++) 
        max = Math.max(max, dp[dp.length - 1][i]);
    
     return max;
		
		
	}
}
