package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int arr[]=new int[n];
		int result[]=new int[n];
		
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> resultList = new ArrayList<>();
		
		int max = 0;
		
		for(int i=0; arr.length>i; i++){
			
			list.add(arr[i]);
		}
		
		
		for(int i=n-1; i>=0; i--){
			resultList.add(arr[i],i+1);
			System.out.println(resultList);
		}
		
		
		//System.out.println(resultList);
		
		System.out.println(list);
		
		
		
	}
}
