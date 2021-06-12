package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon14659 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
			
		int max = 0;
		int temp=0;
		for(int i=0; i<N-1; i++){
			
			for(int j=i+1; j<N; j++){
				
				if(arr[i]<arr[j]){
					temp = 0;
					break;
				}else {
					temp ++;
					//System.out.println(temp+" ,"+i);
					if(temp > max){
						max = temp;
					}
				}
				
			}
			temp = 0;
		}
		
		
		System.out.println(max);
		
		
	}
}
