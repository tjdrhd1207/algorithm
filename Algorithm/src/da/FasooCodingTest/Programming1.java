package da.FasooCodingTest;

import java.util.Scanner;
import java.util.Stack;

public class Programming1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);		
		
		String s = sc.nextLine();
		
		int[] idx= new int[s.length()+1]; 
		
		
			
		System.out.println(solution(s,idx));
	}
	
	public static int[] solution(String s, int[] idx){
		int[] answer= {};
		int[] temp= {};
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++){
			
			if(stack.get(i)=='{'){
				idx[i]=i;
				stack.push(s.charAt(i));
			}
			else if(stack.get(i)=='}'){
				idx[i]=i;
				stack.pop();
			}
		
		}
		
		System.out.println(idx);
		
		
		
		return answer;
	}

}
