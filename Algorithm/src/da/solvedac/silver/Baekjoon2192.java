package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon2192 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
	
		
		int result[]=new int[n+1];
		
		if(n==1){
			result[0]=1;	
		}
		else if(n==2) {
		result[1]=1;
		}
		
		else {
			
			
		for(int i=2; i<=n; i++){
			result[0]=1;	
			result[1]=1;
			result[i]=result[i-1]+result[i-2];
			
		}
		}
		
		System.out.println(result[n-1]);
		
	}
}
