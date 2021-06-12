package da;

import java.util.Scanner;

public class Baekjoon9507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++){
			int arraySize = sc.nextInt();
			
			int arr[]= new int[arraySize+1];
			
			
			arr[0]=1;
			if(arraySize == 0) {
				System.out.println(arr[0]);
				continue;
			}
			
			arr[1]=1;
			if(arraySize == 1) {
				System.out.println(arr[1]);
				continue;
			}
			arr[2]=2;
			if(arraySize == 2) {
				System.out.println(arr[2]);
				continue;
			}
			
			arr[3]=4;
			
				for(int j=4; j<=arraySize; j++) {
				arr[j]=arr[j-1]+arr[j-2]+arr[j-3]+arr[j-4];
			
				}
			
				System.out.println(arr[arraySize]);
			
		}
		
		
		
		
		
	}

}
