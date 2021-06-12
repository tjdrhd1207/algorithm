package da;

import java.util.Scanner;

public class CodingTest4Re1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]=new int[n+1];
	
		
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		
		
		for(int i=4; i<=n; i++){
			int mid=i/2;
			
			for(int j=2; j<=mid; j++){
				 arr[i]=Math.max(arr[i], arr[j]*arr[i-j]);
				
			}
		}
		
		System.out.println(arr[n]);
		
	}

}
