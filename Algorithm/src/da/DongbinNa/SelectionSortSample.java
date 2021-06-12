package da.DongbinNa;

import java.util.Scanner;

public class SelectionSortSample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		
		int arr[]= new int[N];
		
		for(int i=0; i<N; i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<N; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
	
		for(int i=0; i<N; i++){
			
			int min = Integer.MAX_VALUE;
			int temp;
			int where = 0;
			
			for(int j=i; j<N; j++){
				if(min>arr[j]){
					min=arr[j];
					where=j;
				}
			}
			temp=arr[i];
			arr[i]=min;
			arr[where]=temp;
		}
	
		for(int i=0; i<N; i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
