package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1759 {

	static ArrayList<String> list = new ArrayList<>();
	static boolean visited[];
	static String[] arr;
	static int L;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
			L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		 arr= new String[C];
		
		String str2 = br.readLine();
		st = new StringTokenizer(str2," ");
		for(int i=0; i<arr.length; i++){
			arr[i] = st.nextToken();
		}
		
		/*for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}*/
		solution(L, arr);
	}

	public static String solution(int L, String arr[]){
		String answer = "";
		String result = "";
		visited = new boolean[arr.length];
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		System.out.println(arr[i]);
		System.out.println("시작");
		nCr(0,0);
		
		return answer;
	}
	
	public static void nCr(int start, int depth){
		//System.out.println("시작2");
		if(depth == L){
			./
			int jaeum = 0; //cons 자음
			int moeum = 0; //vowel 모음
			String ans = "";
			
			for(int i=0; i<visited.length; i++){
				if(visited[i]){
					ans += arr[i];
					System.out.println("ans : "+ans);
					if(arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")){
						moeum++;
					}else {
						jaeum++;
					} 
				}
				
			}
			
			if(moeum>=1 && jaeum >= 2){
			 	System.out.println(ans);
			return;
		}
			
			
	  }
		
		//이 부분은 조합이랑 비슷함
		for(int i = start; i <visited.length; i++){
			visited[i] = true;
			nCr(i+1, depth+1); // 더 깊숙히 탐색
			visited[i] = false;
		}
		
	}
	
	
}
