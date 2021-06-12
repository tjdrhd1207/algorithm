package da;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon10845 {
	
	public static void main(String[]args){
		
		
		int b=0;
		Deque<Integer> que = new LinkedList<>();
		
		
		Scanner sc = new Scanner(System.in);
		
		int cnt=sc.nextInt();
		
		for(int i=0;i<cnt; i++){
			
			String a = sc.next();
			
			if(a.equals("push")){
				b=sc.nextInt();
				que.add(b);
				System.out.println("현재 que :"+que);
			}else if(a.equals("front")){
				System.out.println(que.isEmpty()?-1:que.peekFirst());
				System.out.println("현재 que :"+que);
			}else if(a.equals("back")){
				System.out.println(que.isEmpty()?-1:que.peekLast());
				System.out.println("현재 que :"+que);
			}else if(a.equals("size")){
				System.out.println(que.size());
				System.out.println("현재 que :"+que+"size");
			}else if(a.equals("pop")){
				System.out.println(que.isEmpty()?-1:que.poll());
				System.out.println("현재 que :"+que);
			}else if(a.equals("empty")){
				System.out.println(que.isEmpty()?1:0);
				System.out.println("현재 que :"+que);
			}
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
}
