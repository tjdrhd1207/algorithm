package da;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NDS_CodingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 잔");
		int N= sc.nextInt();
		System.out.println("커피 개수");
		int m=sc.nextInt();
		int coffee_times[] = new int[m];
		
		for(int i=0; i<m; i++){
			coffee_times[i]=sc.nextInt();
		}
		
		solution(N,coffee_times);
		
	}
	
	
	
	    public static void solution(int N, int[] coffee_times){
	    	
	    	Queue q= new LinkedList<Integer>();
	        Queue q2 = new LinkedList<>();
	    	
	        int [] status = new int[coffee_times.length];
	        int time=0;
	        
	        while(true) {
	            // 도착한 버스 제거 
	            if(!q.isEmpty() && status[(int) q.peek()] == time) {
	                weight += truck_weights[onBridge.poll()];
	            }
	        
	        
	        
	    	
	    }
	    
}
