package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1931_2 {
	
	//회의실 배정 - 그리디 알고리즘
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n =Integer.parseInt(br.readLine());
		
		
		int array[][] = new int[n][2];
		
		for(int i=0; i<n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<2; j++){
				array[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(array, new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]){
					return o1[0]-o2[0];
				}else {
					return o1[1]-o2[1];
				}
			}
			
			
			
			
		});
		
		
		
		int cnt=0;
		int temp=-1;
		//System.out.println(temp);
		for(int i=0; i<n; i++){
			
		 if(temp<array[i][0]) {
			 temp = array[i][1];
			 //System.out.println("temp 값 "+temp);
			 cnt++;
		 }

	  }
		
		System.out.println(cnt);
	}

}
