package da;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon10773 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수 
		int test =sc.nextInt();
		Stack<Integer> array = new Stack<Integer>();
		
		
		int sum=0;
		for(int i=0; i<test; i++){
		
			int x =sc.nextInt();
			
			
			if(x==0){
				array.pop();
			}else {
				array.push(x);
			}
			//System.out.println(array);
		}
		
		
		for(int index: array){
			sum+=index;
		}
		
		System.out.println(sum);
		

	}

}
