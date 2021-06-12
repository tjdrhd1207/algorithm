package da.DongbinNa;

import java.util.Scanner;

public class QuickSortSample {

	public static void quickSort(int[] arr, int start, int end){
		if(start>=end) return; //원소가 1개일 때 강제 종료
		int pivot = start;//피벗은 첫 번째  원소
		int left = start + 1;
		int right = end;
		
		while(left <= right){
			//피벗보다 큰 데이터를 찾을 때까지 반복
			while(left <= end && arr[left] <= arr[pivot])left++;
			//피벗보다 작은 데이터를 찾을 때까지 반복
			while(right > start && arr[right] >= arr[pivot])right--;
			//엇갈렸다면 작은 데이터와 피벗을 교체
			if(left > right){
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			//엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
			}else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			
		}
		
		
		quickSort(arr, start, right-1);
		quickSort(arr, right+1, end);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		quickSort(arr,0,n-1);
	
		/*int pivot;
		int index=0;
		int leftTemp=0;
		int rightTemp=0;
		int temp;
		for(int i=0; i<n; i++){
			pivot=arr[index];
			
			for(int j=i+1; j<n; j++){
				if(arr[index]<arr[j]){
					leftTemp=j;
					continue;
				}
			for(int k=n-1; k>0; k--){
				if(arr[index]>arr[k]){
					rightTemp=k;
					continue;
				}
			}	
			
				if(leftTemp<rightTemp) {
				temp=arr[leftTemp];
				arr[leftTemp]=arr[rightTemp];
				arr[rightTemp]=temp;	
				}
				
				else if(leftTemp>rightTemp){
				temp=arr[index];
				arr[index]=arr[rightTemp];
				arr[rightTemp]=temp;
				}
				
			}
		}*/
	
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		
			
		
		
		
	}

	
	
}
