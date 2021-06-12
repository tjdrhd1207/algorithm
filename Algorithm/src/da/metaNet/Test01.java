package da.metaNet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String orders[]={"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
		
		
		solution(orders);
		
		
	}
	
	
	public static String[] solution(String[] orders){
		
		String[] answer = {};
		
		HashMap<String,String> map = new HashMap<String, String>();
		
		HashMap<String,Integer> menuCnt = new HashMap<String, Integer>();
		HashSet <String> set = new HashSet<String>();
		
		ArrayList<Integer> cntMenu = new ArrayList<Integer>();
		
		int cnt = 0;
		for(int i=0; i<orders.length; i++){
			
			String[] menu = orders[i].split(" ");
			for(int j=1; j<menu.length; j++) {
			
				map.put(menu[j],menu[0]);
				if(map.containsValue(menu[0])){
					System.out.println(map.get(key));
					cnt++;
					}
				else {
					cntMenu.add(cnt);
					
					cnt=0;
				}
				System.out.println(map);
				
			}
			System.out.println();
		}
		
		System.out.println(cntMenu);
		
		return answer;
	}
	
}
