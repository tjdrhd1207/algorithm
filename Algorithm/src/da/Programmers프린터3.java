package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Programmers프린터3 {

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
		
		Deque<Integer> deq = new ArrayDeque<Integer>();
		Deque<Integer> locationIndex = new ArrayDeque<Integer>();
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		
		for(int i=0; i<priorities.length; i++){
			deq.add(priorities[i]);
			locationIndex.add(i);
		}
		
		int i=0;
		
		while(!deq.isEmpty()){
			
			
			boolean flag = false;
			
			int standard = priorities[i];
			
			for(int j=i+1; j<priorities.length; j++){
				//기준보다 큰 수 존재한다면
				if(standard < priorities[j]){
					//덱의 맨 첫번쨰 지운 후 맨 뒤로 보낸다.
			
					flag = true;
					break;
				}
				
				
			}
			
			if(flag == true){
				deq.removeFirst();
				deq.addLast(standard);
				locationIndex.removeFirst();
				locationIndex.addLast(i);
			}else {
				result.add(standard);
				deq.removeFirst();
			}
			
				
			i++;
			if(i==priorities.length-1){
				i=0;
			}
		}
		
		System.out.println(deq);
		System.out.println("locationIndex : "+locationIndex);
		System.out.println(result);
		
		/*
		for(int i=0;  i<priorities.length; i++){
			answerList.add(locationIndex.pop());
		}
		
		for(int i=0; i<priorities.length; i++){
			if(location == answerList.get(i)){
				answer = i;
			}
		}
		//answer = answerList.get(location);
		
		answer+=1;
		
		System.out.println("answerList : "+answerList);
		System.out.println("answer: "+answer);
		return answer;
		*/
		return answer;
	}

}
