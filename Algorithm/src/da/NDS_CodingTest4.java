package da;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NDS_CodingTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("N 입력: ");
		int N=sc.nextInt();
		System.out.println("coffee_times의 길이 :");
		int L=sc.nextInt();
		int coffee_times[]=new int[L];
		for(int i=0; i<5; i++){
			coffee_times[i]=sc.nextInt();
		}
		
		solution(N,coffee_times);
		
	}
	
	
	private static void solution(int N, int coffee_times[]){
		
		int newArray[]=new int[N];
		
		int resultArray[]=new int[N];
		
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		int time=0;
		int fist=0;
		
		for(int i=0; i<N; i++){
			newArray[i]=coffee_times[i];
		}
		
		
		while(true){
			if(!(q.size()==N)){
				
				q.add(time);
				time++;
				
			}
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
	

}
