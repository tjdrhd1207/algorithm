package da.DongbinNa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2Answer {

	public static int binarySearch(int[] arr, int start, int end, int find){
		while(start<=end){
			int mid = (start + end)/2;
			//찾은 경우 중간점 인덱스 반환
			if(arr[mid] == find) return mid;
			//중간점의 값보다 찾고자 하는 값이 클경우 오른쪽 확인
			else if(arr[mid] > find )end = mid -1;
			//중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
			else start = mid+1;
			
			}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		int find[] = new int[m];
		for(int i=0; i<m; i++){
			find[i]=sc.nextInt();
		}
		
		for(int i=0; i<m; i++){
			int result = binarySearch(arr,0,n-1,find[i]);
			if(result != -1){
				System.out.print("yes ");
			}else {
				System.out.print("no ");
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println("실행시간 : "+(end-start)/1000.0+"초");
		
	}

}
