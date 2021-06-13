package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Programmers프린터2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		
		int priorities[] = new int[length];
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int i=0;
		
		while(st.hasMoreTokens()){
			priorities[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		int location = Integer.parseInt(br.readLine());
		
		solution(priorities, location);
		
	}
	
	public static int solution(int[] priorities, int location){
		int answer = 0;
		
		//Deque<Integer> deq = new ArrayDeque<Integer>();
		Deque<Integer> locationIndex = new ArrayDeque<Integer>();
		
		Queue<Printer> q = new LinkedList<>();
		
		for(int i=0; i<priorities.length; i++){
			q.offer(new Printer(i, priorities[i]));
		}
		
		while(!q.isEmpty()){
			
			boolean flag = false;
			int current = q.peek().prior;
			int index = q.peek().location;
			System.out.println("current : "+current+", location : "+index);
			for(Printer p : q){
				if( current < p.prior){ //맨 앞의 수보다 큰 숫자가 존재하면
					flag = true;
				}
			}
			
			if(flag){
			//q.poll은 맨앞에꺼 제거
			//q.offer은 맨뒤에 추가
				q.offer(q.poll());
				System.out.println("queue : "+q);
			}else {//현재 맨 앞의 수가 가장 클 때
				if(q.poll().location == location){
					System.out.println("q.size : "+q.size());
					answer = priorities.length - q.size();
					System.out.println("맞아");
				}else {
					System.out.println("아니야");
				}
			}
		}
		
		System.out.println(answer);
		return answer;
	}

}

class Printer{
	int location;
	int prior;
	
	public Printer(int location, int prior) {
		super();
		this.location = location;
		this.prior = prior;
	}

	@Override
	public String toString() {
		return "Printer [location=" + location + ", prior=" + prior + "]";
	}
	
	
	
}
