package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//int N = sc.nextInt();
		int N = Integer.parseInt(br.readLine());
		
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0; i<N; i++){
			
			//array.add(sc.nextInt());
			array.add(Integer.parseInt(br.readLine()));
		}
		
		
		Collections.sort(array);
		//System.out.println(array);
		
		for(int x : array){
			sb.append(x).append('\n');
		}
		System.out.println(sb);
		
		
	}

}
