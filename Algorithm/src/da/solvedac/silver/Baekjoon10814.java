package da.solvedac.silver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10814 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String info[][] = new String[4][N];
		String rank[][] = new String[3][N];
		int cnt=0;
		String changeCnt="";
		int ranking[]=new int[N];
		for(int i=0; i<N; i++){
			info[0][i]=sc.next();
			info[1][i]=sc.next();
			cnt++;
			changeCnt=String.valueOf(cnt);
			info[2][i]=changeCnt;
		}
		
		
		for(int i=0; i<N; i++){

			for(int j=0; j<N; j++){
				if(i==j){
					continue;
				}else {
					if(Integer.parseInt(info[0][i])>Integer.parseInt(info[0][j])){
						ranking[i]++;
						
						
					}
					else if(Integer.parseInt(info[0][i])==Integer.parseInt(info[0][j])){
						if(Integer.parseInt(info[2][i])>Integer.parseInt(info[2][j])){
							ranking[i]++;
						}
						
					}
					
					
					
				}
				
			}
		}
		
		for(int i=0; i<N; i++){
			info[3][i]=String.valueOf(ranking[i]);
		}
		
		ArrayList <String> array = new ArrayList<String>();
		
		
		
		
			
		
	
	}

}
