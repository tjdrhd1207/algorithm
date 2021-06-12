package da.metaNet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Test01_re {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String orders[]={"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
		
		
		System.out.println(solution(orders));
		
		
	}
	
	
	public static ArrayList<String> solution(String[] orders){
		
		ArrayList <String> answer = new ArrayList<String>();
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		HashSet <String> set = new HashSet<String>();
		
		ArrayList<Integer> cntMenu = new ArrayList<Integer>();
		
		int cnt = 1;
		for(int i=0; i<orders.length; i++){
			
			String[] menu = orders[i].split(" ");
			for(int j=1; j<menu.length; j++) {
			
				set.add(menu[0]+" "+menu[j]);
			}
			System.out.println();
		}
		ArrayList<String> setMenu = new ArrayList<String>(set);
		
		Collections.sort(setMenu);
		
		String name;
		
		for(int i=0; i<setMenu.size(); i++){
			name = setMenu.get(i).substring(0,setMenu.get(i).lastIndexOf(" "));
			
			if(map.containsKey(name)){
				map.put(name,cnt++);
			}else {
				cnt=1;
				map.put(name,cnt++);
			}
		}
		
		int max = -1;
		String maxName = "";
		
		ArrayList <String> resultName = new ArrayList<String>();
		
		for(Map.Entry<String,Integer> entry : map.entrySet()){

		
			if(entry.getValue()>max){
				max=entry.getValue();
				maxName = entry.getKey();
				
			}else if(entry.getValue()== max){
				maxName += " "+entry.getKey();
			}
		
		}
		
		String result[] =maxName.split(" ");
		
		/*for(int i=0; i<result.length; i++){
			if(i!=result.length-1) {
			System.out.print("[\""+result[i]+"\""+", ");
			}
			else {
				System.out.print("\""+result[i]+"\"]");	
			}
		}*/
	
		for(int i=0; i<result.length; i++){
			resultName.add(result[i]);
		}
	
		//System.out.println(answer.size());
		
		for(int i=0; i<resultName.size(); i++){
			answer.add(resultName.get(i)) ;
		}
		//System.out.println(answer);
		
		return answer;
	}
	
}
