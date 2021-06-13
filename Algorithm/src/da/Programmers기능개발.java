package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Programmers기능개발 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("배열 길이 입력");
		int progressesLength = Integer.parseInt(br.readLine());
		System.out.println("progress원소 입력");
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");

		int progresses[] = new int[progressesLength];
		
		int cnt = 0;
		
		while(st.hasMoreTokens()){
			progresses[cnt] = Integer.parseInt(st.nextToken()); 
			cnt++;
		}
			
		int speeds[] = new int[progressesLength];
		
		cnt = 0;
		System.out.println("speeds배열 입력");
		String str2 = br.readLine();
		
		StringTokenizer st2 = new StringTokenizer(str2," ");
		
		while(st2.hasMoreTokens()){
			speeds[cnt] = Integer.parseInt(st2.nextToken()); 
			cnt++;
		}
		
		System.out.println("밖인가요");
		solution(progresses, speeds);
		
	}

	
	public static int[] solution(int[] progresses, int[] speeds){
		
		//int[] answer = {};
		
		Stack<Integer> stack = new Stack<Integer>();
		int day[] = new int[progresses.length];
		
		for (int i = 0; i <progresses.length; i++) {
			day[i] = ((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));
		}
		
		for(int i=progresses.length-1; i>=0; i--){
			stack.push(day[i]);
		}
		System.out.println(stack);
		ArrayList<Integer> s = new ArrayList<Integer>();

		while (!stack.isEmpty()) {
			int cnt = 1;

			int top = stack.pop();

			while (!stack.isEmpty() && stack.peek() <= top) {
				cnt++;
				stack.pop();
			}

			s.add(cnt);
		}

		int[] answer = new int[s.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = s.get(i);
			System.out.print(answer[i]+" ");
		}
		return answer;
	}
}
