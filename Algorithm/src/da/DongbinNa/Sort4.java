package da.DongbinNa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sort4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int A[] = new int[N];
		int B[] = new int[N];
		
		
		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++){
			B[i] = sc.nextInt();
		}
		
		ArrayList<Integer> arrA = new ArrayList<Integer>();
		ArrayList<Integer> arrB = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
		arrA.add(A[i]);
		arrB.add(B[i]);
		}
		
		Collections.sort(arrA, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2.compareTo(o1);
			}});
		
		
		Collections.sort(arrB);
		
		
		for(int i=0; i<N; i++){
			A[i] = arrA.get(i);
			B[i] = arrB.get(i);
		}
		
		int index = N-1;
		int cnt=K;
		while(cnt>0) {
			if(A[index]<B[index]) {
			A[index] = B[index];
			index--;
			cnt--;
			}else{
			cnt--;
			}
		}
		
		for(int result : A){
			System.out.print(result+" ");
		}
		System.out.println();
		System.out.println(arrA);
		System.out.println(arrB);
		
		
	}

}
