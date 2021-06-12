package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1946 {
	
	//신입사원  - 그리디알고리즘
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	
	
	
	Scanner sc = new Scanner(System.in);
		
	
	long start = System.currentTimeMillis();
	
	String s = br.readLine();
	
	int T = Integer.parseInt(s);	
	
	for(int h=0; h<T; h++) {
		String n1 = br.readLine();
		int N = Integer.parseInt(n1);
		
		int a[] = new int[N];
		int b[] = new int[N];
		
		boolean visit[] = new boolean[N];
		
		for(int i=0; i<N; i++){
		String x = br.readLine();
		
		StringTokenizer st = new StringTokenizer(x, " ");
		
		a[i] = Integer.parseInt(st.nextToken());
		b[i] = Integer.parseInt(st.nextToken());
		visit[i]= true;
		}
		
	int cnt=0;
	
	for(int i=0; i<N; i++){
		for(int j=0; j<N; j++){
			
			
			if(a[i]>a[j]){
				if(b[i]>b[j]){
				 visit[i]=false;
				 break;
				}
			}
			
		}
	
	}
	
	for(int i=0; i<N; i++){
		if(visit[i]==true){
			cnt++;
		}
	}
	System.out.println(cnt);
	}
	
	
	long end = System.currentTimeMillis();
	System.out.println("실행시간 : "+(end-start)/1000.0);
	
	}
}
