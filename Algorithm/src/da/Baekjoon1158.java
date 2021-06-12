package da;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Baekjoon1158{

	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//n,k 입력
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		//Deque<Integer> deque1 = new ArrayDeque<>();
		LinkedList <Integer> list = new LinkedList<Integer>();
		ArrayList <Integer> array = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++){
			list.add(i);
		}
		//System.out.println(list);
		//System.out.println("-------");
		
		
		
		while(list.size()!=0) {
		
		int cnt =0;	
			
			
		
		while(true){
			cnt++;
			if(cnt==3){
				
				array.add(list.peek());
				list.pop();
				
				break;
			}
			
			int x=list.get(0);
			list.pop();
			list.addLast(x);
			
			//System.out.println(list);
			
			}
		//System.out.println("list : "+list);
		}
		
		System.out.print("<");
		for(int j=0; j<array.size(); j++){
			if(j==array.size()-1) {
			System.out.print(array.get(j));
			}
			else {
				System.out.print(array.get(j)+",");
			}
		}
		System.out.println(">");
		//System.out.println(array);
		
	}
	
}
