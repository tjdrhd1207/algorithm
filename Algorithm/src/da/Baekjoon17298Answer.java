package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon17298Answer {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		int seq[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		for(int i=0; i<N; i++){
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0; i<N; i++){ 
			
		/*
		 * 스택이 비어있지 않으면서
		 * 현재 원소가 스택의 맨 위 원소가 가리키는 원소보다 큰 경우
		 * 해당 조건을 만족할 때까지 stack의 원소를 pop하면서
		 * 해당 인덱스의 값을 현재 원소로 바꿔준다.
		 * */
			
		while(!stack.isEmpty() && seq[stack.peek()] < seq[i]){
			seq[stack.pop()] = seq[i];
		} 	
			stack.push(i);
			
		}
		
		/*
		 * 스택의 모든 원소를 pop하면서 해당 인덱스의 value를
		 * -1로 초기화한다.
		 * */
		
		while(!stack.isEmpty()){
			seq[stack.pop()] = -1;
		}
		
		
		
	}

}
