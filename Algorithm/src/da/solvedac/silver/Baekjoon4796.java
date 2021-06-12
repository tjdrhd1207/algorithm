package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon4796 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int i=0;
		while(true){
			
			
			
			String s = br.readLine();
			
			StringTokenizer st = new StringTokenizer(s," ");
			
			int l = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(l==0 && p==0 && v==0){
				
				break;
			}
			i++;
			System.out.println("Case "+i+": "+solution(l,p,v));
			
		}
	}
	
	
	public static int solution(int l, int p, int v){
		
		int mok=0;
		int nmg=0;
		int result=0;
	
		mok = v/p;
		result +=mok*l;
		nmg = v%p;
		
		if(nmg>l){
			result+=l;
		}else {
			result+=nmg;
		}
		
		
		
		
		return result;
	}
	
	

}
