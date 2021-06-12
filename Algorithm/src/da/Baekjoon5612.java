package da;

import java.util.Scanner;

public class Baekjoon5612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m= sc.nextInt();
		int max=0;
		int min=0;
		int minus[] = new int[n];
		int arr[]= new int[m];
		int temp=0;
		
		
		for(int i=0; i<n; i++){
			
			for(int j=0; j<m; j++) {
					
			arr[j]=sc.nextInt();
				min=arr[j];
			
			if(arr[j]>max){
				max=arr[j];
				}
			if(arr[j]<min){
				min=arr[j];
			}
			
			
			System.out.println("max : "+max);
			System.out.println("min : "+min);
			}
			minus[i] = Math.abs(max-min);
			
			if(minus[i]>temp){
				temp=minus[i];
				System.out.println("temp 기준 : "+temp);
			}
			
		}
		
		
		System.out.println(temp);
		
		
	}

}
