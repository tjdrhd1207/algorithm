package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon13904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int day[] = new int[N];
		int jumsoo[][] = new int[N][2];
		int score[] = new int[1001];
		
		for(int i=0; i<N; i++){
			for(int j=0; j<2; j++){
				jumsoo[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(jumsoo, new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				
					return o2[1] - o1[1];
				

			}
			
		});
		/*
		for(int i=0; i<N; i++){	
			for(int j=0; j<2; j++) {
			System.out.print(jumsoo[i][j]+" ");
			}
			System.out.println();
		}*/
	
		/*for(int i=0; i<N; i++){	
			
			if(score[jumsoo[i][0]] == 0){
				score[jumsoo[i][0]] = jumsoo[i][1];
			}else if(score[jumsoo[i][0]] < jumsoo[i][1]){
				score[jumsoo[i][0]] = jumsoo[i][1];
			}else {
				 int x = jumsoo[i][0];
				while(x!=1){
					x--;
					if(	score[x] < jumsoo[i][1] ){
						score[x] = jumsoo[i][1];
						break;
					}
					
				}
				
			}
				
			
		}*/
		
		for(int i=0; i<N; i++) {		// 과제 점수가 높은 순
			for(int j=jumsoo[i][0]; j>0; j--) {	// 과제의 마감일로부터 최대한 늦게 과제 하기
				if(score[j] == 0) {
					score[j] = jumsoo[i][1];
					break;
				}
			}
		}
		
		
		int max = 0;
		
		for(int i=0; i<score.length; i++){
			max+=score[i];
		}
		System.out.println(max);
	}
}
