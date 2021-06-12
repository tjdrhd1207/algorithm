package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Baekjoon1212 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String[] eight = {"000","001","010","011","100","101","110","111"};
		//					0     1     2     3     4     5     6     7
		
		String result = "";
		boolean start = true;
		int  n = 0;
		if(s.equals("0")){
			System.out.println("0");
		}
		for(int i=0; i<s.length(); i++){
			
			n = s.charAt(i)-'0';
			//System.out.println(n);
			if(start == true && n < 4){
			  if( n == 0) {
				continue;
			}else if( n == 1){
				System.out.print("1");
			}else if( n == 2){
				System.out.print("10");
			}else if( n == 3 ){
				System.out.print("11");
			}
			start = false;
			
		}else{
			System.out.print(eight[n]);
			start = false;
			}
			
		}
	  
		System.out.println();
	}

}
