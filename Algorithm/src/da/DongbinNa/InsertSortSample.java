package da.DongbinNa;

import java.util.Scanner;

public class InsertSortSample {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int arr[]= new int[n];
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		
		int temp=0;
		
		for(int i=0; i<n; i++){		

			for(int j=0; j<i; j++) {
			if(arr[i]<arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			  }
			}
		}
		
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
	}

}
