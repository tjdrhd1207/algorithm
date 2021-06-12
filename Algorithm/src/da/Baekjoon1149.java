package da;

import java.util.Scanner;

public class Baekjoon1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int x =sc.nextInt();
		
		int arr[][]=new int[x][3];
		int sum[][] = new int [x][3];
		
		for(int i=0;i<x; i++){
			for(int j=0; j<3; j++){
				arr[i][j]=sc.nextInt();
			}
		}
	
		
		sum[0][0]=arr[0][0];
		sum[0][1]=arr[0][1];
		sum[0][2]=arr[0][2];
		
		
		for(int i=1; i<x; i++){
			sum[i][0]=Math.min(sum[i-1][1],sum[i-1][2])+arr[i][0]; 
			sum[i][1]=Math.min(sum[i-1][0], sum[i-1][2])+arr[i][1];
			sum[i][2]=Math.min(sum[i-1][0], sum[i-1][1])+arr[i][2];
			
		}
	
		System.out.println(Math.min(Math.min(sum[x-1][0],sum[x-1][1]),sum[x-1][2]));
		
		
		
		
		
		
	}

	
}
