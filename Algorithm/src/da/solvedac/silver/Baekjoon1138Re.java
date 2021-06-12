package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon1138Re {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		String s2 = br.readLine();
		
		StringTokenizer st2 = new StringTokenizer(s2, " ");
		
		int arr[]=new int[N];
		
		for(int i=0; i<N; i++){
		
			arr[i]=Integer.parseInt(st2.nextToken());	
		
		}
		
		ArrayList<Integer> array = new ArrayList<>();
		
		//int x=1;
		/*for(int i=N-1; i>=0; i--) {
		array.add(arr[i],i+1);
		}*/
		
		for(int i=0; i<N; i++) {
		array.add(arr[N-i-1],N-i);
		}
		
		for(int i=0; i<N; i++) {
		System.out.print(array.get(i)+" ");
		}
	}

}
