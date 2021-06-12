package da.DongbinNa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {

	public static String[] comparePart(int[] arr, int[] request){
		
		//Arrays.sort(arr);
		//Arrays.sort(request);
		
		String result[] = new String[request.length]; 
		boolean flag = false;
		for(int i=0; i<request.length; i++){
			
			flag = false;
			
			for(int j=0; j<arr.length; j++){
				if(request[i]==arr[j]){
					result[i]="yes";
					flag = true;
					continue;
				}
			}
			if(flag == false){
				result[i]="no";
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Scanner sc =new Scanner(System.in);
		//정수 n
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		int m = sc.nextInt();
		
		int request[]= new int[m];
		
		for(int i=0; i<request.length; i++){
			request[i] = sc.nextInt();
		}
		
		String[] result = comparePart(arr,request);
		
		for(String str : result){
		System.out.print(str+" ");
		}
		
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println("실행시간 : "+(end-start)/1000.0+"초");
		
	}

}
