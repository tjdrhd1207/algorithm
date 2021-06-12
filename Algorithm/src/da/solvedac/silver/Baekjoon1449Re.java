package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1449Re {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		StringTokenizer st1 = new StringTokenizer(s, " ");
		
		int N = Integer.parseInt(st1.nextToken());
		
		int L = Integer.parseInt(st1.nextToken());
		
		String s2 = br.readLine();
		
		StringTokenizer st2 = new StringTokenizer(s2, " ");
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i]=Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		int tapeRange= (int)(arr[0]+L-0.5);
		//System.out.println(tapeRange);
		cnt++;
		
		for(int i=1; i<N; i++){
			if(tapeRange<arr[i]){
				tapeRange=(int)(arr[i]+L-0.5);
				//System.out.println(tapeRange);
				cnt++;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}
	
}
