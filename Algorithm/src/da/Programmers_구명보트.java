package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Programmers_구명보트 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int len = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int people[] = new int[len];
		
		int cnt = 0;
		
		while(st.hasMoreTokens()){
			people[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}
		
		int limit = Integer.parseInt(br.readLine());
		
		solution(people, limit);
		
		
		
	}
	
	
	
	
	
	public static int solution(int[] people,int limit){
		int answer = 0;
		
		Stack<Integer> st = new Stack<>();
		
		Arrays.sort(people);
		
		
		int minIndex = 0;
		int min = people[minIndex];
		
		int x =0;

		int maxIndex = people.length-1;
		
		int max = people[maxIndex];
		
		
		while(minIndex<=maxIndex) {
			max = people[maxIndex];
			min = people[minIndex];
			
			if(maxIndex == minIndex){
				answer++;
				break;
			}
			
			if(min+max>limit){
				//맨 뒤 숫자 혼자가도록 처리
				answer++;
				
				maxIndex--;
				

			}
			else if(min+max<=limit){
				minIndex++;
				maxIndex--;
				answer++;
			}
			
		}
		
		
		//System.out.println(st);
		System.out.println(answer);
		
		
		return answer;
	}

}
