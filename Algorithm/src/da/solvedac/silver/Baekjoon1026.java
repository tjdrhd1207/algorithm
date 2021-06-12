package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon1026 {

	
	public static void main(String[]args){
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int A[]=new int[N];
		int B[]=new int[N];
		
		for(int i=0; i<N; i++){
			A[i]=sc.nextInt();
		}
		for(int i=0; i<N; i++){
			B[i]=sc.nextInt();
		}
		
		ArrayList<Integer> arrayA = new ArrayList<Integer>();
		
		ArrayList<Integer> arrayB = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++){
			arrayA.add(A[i]);
		}
		
		for(int i=0; i<N; i++){
			arrayB.add(B[i]);
		}
		
		Collections.sort(arrayA);
		Collections.sort(arrayB);
		Collections.reverse(arrayB);
		
		int result=0;
		
		for(int i=0; i<N; i++){
			result += arrayA.get(i)*arrayB.get(i);
		}
		
		
		System.out.println(result);
		
		
	}
}
