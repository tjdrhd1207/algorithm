package da.DongbinNa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		int arr[][] = new int[N][M];
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		int min[] = new int[N];
		
		for(int i=0; i<N; i++){
		 min[i]=Integer.MAX_VALUE;	
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(min[i]>arr[i][j]){
					min[i]=arr[i][j];
				}
			}
		}
		
	
		
		ArrayList<Integer> minArray = new ArrayList<Integer>();
		
		for(int i=0; i<min.length; i++){
		minArray.add(min[i]);
		}
		
		
		Collections.sort(minArray);
		
		System.out.println(minArray.get(minArray.size()-1));
		
	}

}
