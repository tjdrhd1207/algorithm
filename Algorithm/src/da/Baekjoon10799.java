package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10799 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int sum = 0;
		
		for(int i=0; i<str.length(); i++){
			
			char ch = str.charAt(i);
			
			if(ch=='('){
				stack.push(i);
			}
			else {
				
					if(stack.peek() == (i-1)){
						stack.pop();
						sum += stack.size();
					
					}else {
						stack.pop();
						sum += 1;
					}
				
				}

		}
		
		
		System.out.println(sum);
		
		
		
		
	}

}
