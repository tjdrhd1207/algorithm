package da.DongbinNa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch3 {
	public static int binarySearch(int[] arr,int start, int end, int find){
		
		int startPoint = start;
		int endPoint = end;
		int centerPoint = (int) (start+end)/2;
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>arr[centerPoint]){
				sum += arr[i]-arr[centerPoint];
			}
		}
		
		if(sum>find){
			return binarySearch(arr, startPoint+1, endPoint, find);
		}else if(sum<find){
			return binarySearch(arr, startPoint, endPoint-1, find);
		}else if(sum==find){
			return sum;
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//떡 갯수
		int n = sc.nextInt();
		//원하는 떡의 길이
		int find = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(binarySearch(arr,0,n-1, find));
		
		
	}

}