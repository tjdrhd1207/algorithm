package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon2217 {

	
	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);

		//로프 갯수
		int n = sc.nextInt();
		int nLength = n;
		int arr[]=new int[n];
		int sum[]=new int[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){

			arr[i]=sc.nextInt();

		}
		
		for(int x : arr){
			list.add(x);
		}
		
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++){
			sum[i] = list.get(i)*nLength;
			nLength--;
		}
		
		System.out.println(list);
		int result=0 ;
		for(int i=0; i<n; i++){
			if(sum[i]>result){
				result=sum[i];
			}
		}
		
		
		System.out.println(result);
	}
}
