package da;

import java.util.LinkedList;
import java.util.Scanner;

public class Baekjoon2164 {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		for(int i=n; i>0; i--){
			list.push(i);
		}
		
		
		
		for(int i=0; i<n; i++){
			
			if(list.size()==1){
				break;
			}
			list.poll();
			list.offerLast(list.peek());
			list.poll();
			
			
		}
		for(int x: list) {
		System.out.println(x);
		}
	}
	
}
