package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1449 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int min = 0;
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		String s2 = br.readLine();
		StringTokenizer st2 = new StringTokenizer(s2," ");
		
		int arr[]=new int[N];
		
		for(int i=0; i<N; i++){
			arr[i]=Integer.parseInt(st2.nextToken());
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		
		for(int i=0; i<N; i++){
		
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		int tapeRange = (int)(arr[0]-0.5+L);
		min++;
		System.out.println(tapeRange);
		
		for(int i=1; i<arr.length; i++){
			if(tapeRange < (int)(arr[i] + 0.5)){
				tapeRange = (int)(arr[i]- 0.5 + L);
				min++;
			}
		}
		
		System.out.println(min);
		br.close();
	}

}


