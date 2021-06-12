package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1439 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s,"");
		
		
		int zeroCnt=0;
		int oneCnt=0;
		
		int cnt = 0;
		String s2="";
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='0'){
				zeroCnt++;
			}else if(s.charAt(i)=='1'){
				oneCnt++;
			}
		}
		
		char chStart = s.charAt(0);
		
		for(int i=1; i<s.length(); i++){
			
			char ch = s.charAt(i);
			
			if(ch == chStart){
				continue;
			}else if (ch != chStart){
				if(ch!=s.charAt(i-1)) {
				//System.out.println(ch);
				cnt++;
				}
			}
			
		}
		
		
		System.out.println(cnt);
		
		
		//System.out.println(s2);
	}

}
