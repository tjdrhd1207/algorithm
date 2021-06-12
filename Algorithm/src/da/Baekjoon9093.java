package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Baekjoon9093 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		Stack<Character> stack = new Stack<>();
		String answer = "";
		
		for(int i=0; i<x; i++){
			
			
			String str = br.readLine()+"\n";	
			
			for(int j=0; j<str.length(); j++){
				if(str.charAt(j)==' '|| str.charAt(j)=='\n'){
					//System.out.println("j값 : "+j);
					while(!stack.isEmpty()){
					answer+=stack.pop();
					}
					answer+=" ";
				}
				
				else{
					stack.push(str.charAt(j));
					//System.out.println("Stack : "+stack);
					
				}
			}
		
			
			System.out.println(answer);
			answer="";
		}
		
		
	}

}
