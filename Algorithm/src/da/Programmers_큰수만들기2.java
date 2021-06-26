package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Programmers_큰수만들기2 {
	static ArrayList<Integer> IntToArray = new ArrayList<>();
	static ArrayList<Integer> array = new ArrayList<>();
	static boolean visited[];
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String number = br.readLine();
		
		int k = Integer.parseInt(br.readLine());
		
		solution(number, k);
	}
	
	public static String solution(String number, int k){
		String answer = "";
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int[] intNum = new int[number.length()];
		
		for(int i=0; i<number.length(); i++){
			intNum[i] = number.charAt(i)-48;
			//System.out.println(intNum[i]);
		}

		int newLength = k;
		int start = 0;
		//System.out.println("시작 start : "+start+",시작 newLength : "+newLength);

		
		while(answer.length()!=(number.length()-k)){
			
			int max = Integer.MIN_VALUE;
			
			for(int i=start; i<=newLength; i++){
				//System.out.println("i값 : "+i);
				if(intNum[i]==9){
					max = intNum[i];
					start = i+1;
					break;
				}
				else if(max<intNum[i]){
					max = intNum[i];
					start = i+1;
				}
			}
			//System.out.println("start : "+start);
			//해당 범위까지 순회한 후 max값을 넣어야함
			newLength = newLength+1;
			//System.out.println("newLength : "+newLength);
			answer+=max;
			//System.out.println(result);
		}
		//System.out.println("result : "+result);
		System.out.println(answer);
		
		return answer;
	}

	
}
