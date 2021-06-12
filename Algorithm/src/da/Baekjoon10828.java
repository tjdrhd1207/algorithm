package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("정수 x를 입력하세요 ");
		
		//StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<x; i++){
		//System.out.println("명령어 입력하세요");
	
		String[] str = br.readLine().split(" ");
		
		switch(str[0]){
			case "push" : 
				//System.out.println("정수 인덱스 입력");
				//int stIndex = Integer.parseInt(br.readLine());
				
				stack.push(Integer.parseInt(str[1]));
				//System.out.println("push종료");
				break;
			
			case "pop" :
				if(stack.isEmpty()){
					System.out.println("-1");
				}else{
					System.out.println(stack.pop());
				}
				break;
			
			case "size":
				System.out.println(stack.size());
				break;
			
			case "empty":
				if(stack.isEmpty()){
					System.out.println("1");
				}else {
					System.out.println("0");
				}
				break;
				
			case "top" :
				if(stack.isEmpty()){
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());
				}	
				break;		
			
			
			
				
			}
		}
		
		//System.out.println(stack);
		
		
	}

}
