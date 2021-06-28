package da;

import java.util.Stack;

public class Programmers_올바른괄호 {

	public static void main(String[] args) {

		//String s = "()()";
		//String s = "(())()";
		//String s = ")()(";
		//String s = "(()(";
		//String s = "())())";
		//String s = "()))((()";
 		solution(s);
	}

	public static boolean solution(String s){
		boolean answer = true;
		
		boolean flag = false;
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<s.length(); i++){
			st.push(s.charAt(i));
		}
		int sum = 0;
		//System.out.println(s.charAt(0)+", "+s.charAt(s.length()-1));
		if(s.charAt(0)!='(' || s.charAt(s.length()-1) != ')' ){
			System.out.println("들어옴");
			answer = false;
		}
		else {
			for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);	
			
			if(ch=='('){
				sum++;
			}else {
				
				sum--;
			}
			
				
			if(sum<0){
				break;
			}
			
			}
		}
		
		//System.out.println(answer);
		if(sum!=0 || answer == false){
			answer = false;
			System.out.println(answer);
		}else {
			answer = true;
			System.out.println(answer);
		}
		System.out.println(sum);
		
		return answer;
	}
	
}
