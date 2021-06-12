package da;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GabiaCodingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int coffee_timesLen = sc.nextInt();
		
		int coffee_times[] = new int[coffee_timesLen];
		
		for(int i=0; i<N; i++){
			coffee_times[i]=sc.nextInt();
		}
		
		
		solution(N, coffee_times);
		
	}
	public static int[] solution(int N, int[] coffee_times){
		int answer[]= {};
		
		Queue<Integer> q = new LinkedList<>();
		
		Stack<Integer> st = new Stack<>();
			int time=0;
		
			
		int chuchulgu[] = new int[N];	
		
		for(int i=0; i<N; i++){
			chuchulgu[i]=coffee_times[i];
		}
			
		int index=0;
		while(true) {
			for(int i=0; i<N; i++){
				chuchulgu[i]--;	
			}
			
			for(int i=0; i<N; i++){
				if(chuchulgu[i]==0){
					
				}	
			}
			time++;
		}
		
		
			
		System.out.println(st);
		
		
		return answer;
	}
	
}
