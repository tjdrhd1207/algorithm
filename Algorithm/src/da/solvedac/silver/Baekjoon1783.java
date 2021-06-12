package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1783 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s," ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		if(N==1){
		 result = 1;	
		}else if(N==2){
		 result =(int) Math.min(4,(M+1)/2);
		}else {
			
			if(M<7)
			result = (int) Math.min(4,M);
			
			else
			result = M-2;
			
		}
		
		
	}

}
