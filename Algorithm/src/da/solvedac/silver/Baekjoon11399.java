package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int n= sc.nextInt();
		
		int arr[]=new int[n];
		
		int sum=0;
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
		list.add(arr[i]);
		}
		
		
		/*Collections.sort(list);*/
		Collections.sort(list, new AscendingInteger());
		
		
		System.out.println(list);
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
			sum += list.get(j);
				}
			}
	
		
		System.out.println(sum);
	}

	
}

class AscendingInteger implements Comparator<Integer>{
	
	@Override
	public int compare(Integer a , Integer b){
		return b.compareTo(a);
	}
	
}