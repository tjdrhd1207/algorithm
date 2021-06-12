package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2437 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		int arr[]=new int[N];
				
		for(int i=0; i<N; i++){
			
			arr[i]=Integer.parseInt(st.nextToken());
			
		}
		
		
		Arrays.sort(arr);
		
		int min = 1;
		
		for(int i=0; i<N; i++){
			
			if(min>=arr[i]){
				min= min+arr[i];
			}else {
				break;
			}
			
		}
		
		System.out.println(min);
		
		
	}

}
