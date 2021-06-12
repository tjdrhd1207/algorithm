package da.DongbinNa;

import java.util.Scanner;

public class BinarySearchSample {
	
	
	
	public static int binarySearch(int arr[], int start, int end, int find){
		
		
		int startPoint = start;
		int endPoint = end;
		int center = (int) (end+start)/2;
		int answer=0;
		System.out.println(startPoint+", "+endPoint+", "+center);
		
			
			if(arr[center]>find){
				return binarySearch(arr, startPoint, center, find); 
			}else if(arr[center]<find){
				return binarySearch(arr, center, endPoint, find);
			}else if(arr[center]==find){
				System.out.println("종료, "+center);
				answer=center;
				return answer;
			}
	
			return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//배열 갯수
		int n = sc.nextInt();
		
		int find = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		
		int result = binarySearch(arr, 0, arr.length-1, find);
		System.out.println(result);
	}

}
