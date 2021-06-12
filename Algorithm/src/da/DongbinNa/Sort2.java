package da.DongbinNa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.*;

public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/*ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){
			arr.add(sc.nextInt());
		}*/
		
		Integer arr[] = new Integer[n];
		
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		
		/*Collections.sort(arr,  new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
			
		});;*/
		
		Arrays.sort(arr,Collections.reverseOrder());
	     for(int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	       }
	}

}
