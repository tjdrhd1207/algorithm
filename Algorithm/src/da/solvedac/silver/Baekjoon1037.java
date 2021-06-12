package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon1037 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		//진짜 약수 개수
		ArrayList<Integer> Narray = new ArrayList<Integer>();
		
		int t = sc.nextInt();
		int array[]=new int[t];
		for(int i=0; i<t; i++){
		array[i]=sc.nextInt();
		Narray.add(array[i]);
		}
		
		Collections.sort(Narray);
		//System.out.println(Narray);
		
		int result =0;
		
		int min = Narray.get(0);
		int max = Narray.get(Narray.size()-1);
		
		result = min*max;
		System.out.println(result);
		
	}

}
