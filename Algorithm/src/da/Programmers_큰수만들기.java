package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Programmers_큰수만들기 {
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
		char numArr[] = new char[number.length()];
	
		String result = "";
		
		visited = new boolean[number.length()];
		
		for(int i=0; i<number.length(); i++){
			numArr[i] = number.charAt(i);
			visited[i] = false;
		}
		
		nCr(numArr,number.length()-k,result);
		
		Collections.sort(array);
		System.out.println(array);
		
		answer = Integer.toString(array.get(array.size()-1));
		
		return answer;
	}

	
	
	public static void nCr(char[] num, int k, String result){
		int answer=0;
		int x=0;
		
		if(k==0){
			array.add(Integer.parseInt(result));
			//System.out.println(array);
		}
		else {
			for(int i=0; i<num.length; i++){
			if(visited[i]==false) {
				visited[i]=true;
			nCr(num, k-1, result+num[i]);
				visited[i]=false;
				}
			}
		}
	
	}
}
