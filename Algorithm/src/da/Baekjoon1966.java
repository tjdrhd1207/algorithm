package da;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon1966 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		 
		
		//test 케이스 입력
		int test = sc.nextInt();
		int n,m,count;
		
		//test 케이스 내부  문서 수, 찾을 index위치, 중요도 입력
	
		for(int i=0; i<test; i++){
			LinkedList<int[]> queue = new LinkedList<>();
			count = 0;
			n=sc.nextInt();
			m=sc.nextInt();
			
			for(int j=0; j<n; j++){
				queue.add(new int[]{j,sc.nextInt()});
				//인덱스, 중요도 입력받기
				
				}
			while(!queue.isEmpty()){//큐가 빌때까지
				
				
				int now[] = queue.poll();
				System.out.println("now[0]"+now[0]);
				System.out.println("now[1]"+now[1]);
				boolean able = true;
				
				for(int q[]:queue){
					if(q[1]>now[1]){
						able = false;
					}
				}
				if(able){
					count++;
					if(now[0]==m){
						break;
					}
						
				}else {
					queue.add(now);
				}
				
				
			}
			System.out.println(count);	
				
				
			
			
			
			
			
			
			
		}	
			
			
			
			
			
		
		
		

	}

}
