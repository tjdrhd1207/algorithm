package da;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Programmers_위장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		sc.nextLine();
		String arr[][] = new String[x][2];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				arr[i][j]=sc.nextLine();
				
			}
		}
		System.out.println(solution(arr));
		
	}

	
	
	public static HashMap solution(String[][] clothes){
		
		HashMap<String, String> answer = new HashMap<String,String>();
		
		Set<String> keys = answer.keySet();
		
		for(int i=0; i<clothes.length; i++){
			
				answer.put(clothes[i][0],clothes[i][1]);	
			
		}
		
		
		for(int i=0;i<answer.size(); i++){
			for(int j=0; j<answer.size(); j++){
					
			}
		}
		
		System.out.println("key :"+keys);
		
		return answer;
	}
	
}
