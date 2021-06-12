package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon7568 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int weight[] = new int[N];
		int height[] = new int[N];
		int answer[] = new int[N];
		
		for(int i=0; i<N; i++){
			weight[i]=sc.nextInt();
			height[i]=sc.nextInt();
		}
		
		for(int i=0; i<N; i++){
			
			for(int j=0; j<N; j++){
				
				if(i == j){
					continue;
				}
				if(weight[i] < weight[j] && height[i] < height[j]){
					answer[i]++;
				}
				
				
			}
		}
		
		
		for(int rank : answer){
			System.out.print((rank+1)+" ");
		}
		
		
	}

}
