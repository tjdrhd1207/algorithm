package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programmers_카펫 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int brown = Integer.parseInt(br.readLine());
		int yellow = Integer.parseInt(br.readLine());
		
		solution(brown, yellow);
	}
	
	public static int[] solution(int brown, int yellow){
		int[] answer = {};
		
		int sum = brown+yellow;
		int x = 0;
		int y = 0;
		
		for(int i=3; i<=(int)(brown+4)/2; i++) {
			//int temp = (brown+4)/2;
			
			if(sum % i ==0){
				x = sum/i;
				y = sum/x;
				
				
				int a = x-2;
				int b = y-2;
				if(a*b == yellow && x >= y){
					break;
				}
			}
		 	
		}
		System.out.println("x : "+x+", y : "+y);
		
		return answer;
	}
}
