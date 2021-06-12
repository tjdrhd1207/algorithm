package da.DongbinNa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		int K = sc.nextInt();
		
		int arr[] = new int[N];
				
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++){
			
		numArray.add(arr[i]);
		
		}
		
		Collections.sort(numArray);
		
		//System.out.println(numArray);
		
		
		int x = numArray.get(N-1);
		
		int sum = 0;
		int cnt = 0;
		int kcnt = 0;
		while(true){
			
			if(kcnt==K){
				x=numArray.get(N-2);
				kcnt=0;
			}
			else {
				x=numArray.get(N-1);
			}
			sum+=x;
			cnt ++;
			kcnt ++;
			//System.out.println(sum);		
			if(cnt>=M){
				break;
			}
			
		}
		
		
		System.out.println(sum);
		
		
	}

}
