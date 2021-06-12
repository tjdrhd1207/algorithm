package da.Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		//int b = sc.nextInt();
		
		sc.nextLine();
		
		String clothes[][] = new String[a][2];
		for(int i=0; i<a; i++){
			clothes[i][0]=sc.nextLine();
			clothes[i][1]=sc.nextLine();
		}
		System.out.println("최종 "+solution(clothes));
	}

	public static int solution(String[][] clothes){
		int answer = 0 ;
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0; i<clothes.length; i++){
			if(map.get(clothes[i][1])==null){
				map.put(clothes[i][1],1);
			}else {
				map.put(clothes[i][1],map.get(clothes[i][1])+1);
			}
				
		}
		
		System.out.println("map.get "+ map.get(clothes[0][1]));
		Set<String> key = map.keySet();
	
		System.out.println(key);	
	
		for(String keys: map.keySet()) {
    		answer *= (map.get(keys) + 1);
    	}
		System.out.println(answer);
		 ,ug. /
		 	 
		return answer;
	}
}

