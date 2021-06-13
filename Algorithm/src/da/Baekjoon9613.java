package da;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon9613 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){

			int N = sc.nextInt();
			
			int arr[] = new int[N];
			
			for(int j=0; j<N; j++){
				arr[j] = sc.nextInt();
				
			}
			
			long sum = 0;
			
			for(int j=0; j<N-1; j++){
				
				for(int k=j+1; k<N; k++){
					
					int a = Math.max(arr[j], arr[k]);
					int b = Math.min(arr[j], arr[k]);
					
					sum += gcd(a,b);
					
				}
			}
			System.out.println(sum);
			
		}
		

	}

	public static int gcd(int a, int b){
		int answer = 0;
		
		if(b==0){
			return a;
		}else {
			return gcd(b, a%b);
		}
		
		
		
	}
}
