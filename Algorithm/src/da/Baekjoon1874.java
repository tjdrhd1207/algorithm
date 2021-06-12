package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//스택 수열
public class Baekjoon1874 {

	public static void main(String[]args) throws NumberFormatException, IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		//구현 원하는 수열
		Stack<Integer> stack = new Stack<Integer>();
		
		//수열
		Stack<String> result = new Stack<String>();
		
		int array[] = new int[x];
		
		for(int i=0; i<x; i++){
			
			int index = Integer.parseInt(br.readLine());
			
			array[i] = index;
		}
		
		int cnt = 0;
		int j = 1;
		//stack.push(j);
		//result.push("+");
		
		while(true){
			
			if(cnt >=x || stack.size()>= x){
				break;
			}
			
			//stack에다 수열 1부터 하나씩 push
			if(stack.isEmpty() || stack.peek() != array[cnt]){
				//j도 한개 넣었으니까 증가
				stack.push(j);
				result.push("+");
				//System.out.println(stack);
			
				j++;
				
				
			}  if(stack.peek() == array[cnt]){
				stack.pop();
				result.push("-");
				//cnt값도 한 개 증가
				cnt++;
			}
			
			
		}
		
		//System.out.println("result "+stack);
		
		if(stack.isEmpty()){
			for(int k=0; k<result.size(); k++) {
			System.out.println(result.get(k));
			}
		}else {
			System.out.println("NO");
		}
		
		

		
		
	}
}
