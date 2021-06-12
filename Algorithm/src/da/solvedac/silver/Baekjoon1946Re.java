package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1946Re {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		while(T>0){
			T--;
			int n= Integer.parseInt(br.readLine());
			int a[] = new int[n+1];
			
			for(int i=0; i<n; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				a[x]=y;
				System.out.println(a[x]);
			}
			
			int cnt = 1; //x가 1 일때 무조건 가능하므로 1로 시작
			int standard = a[1]; //기준 값, 처음에는 x가 1일때의 y값
			
			for(int i=2; i<=n; i++){
				if(standard>a[i]){
					cnt++; //추가
					standard = a[i]; //기준값 a[i]의 y값으로 변경
					System.out.println("standard : "+standard);
					}
				}
			System.out.println(cnt);
			}
		
		
		
	}

}
