package da;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Programmers_오픈채팅방_Answer {

	public static void main(String[] args) {

		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		
		solution(record);
		
	}

	public static String[] solution(String[] record){
		
		ArrayList<String> arr= new ArrayList<>();
		HashMap<String,String> map = new HashMap<>();
		
		for(int i=0; i<record.length; i++){
			String command[] = record[i].split(" ");
				
			if(command[0].equals("Enter")){
				arr.add(command[1]+"님이 들어왔습니다.");
				map.put(command[1],command[2]);
			}else if(command[0].equals("Leave")){
				arr.add(command[1]+"님이 나갔습니다.");
				
			}else if(command[0].equals("Change")){
				System.out.println("변경전 map : "+map);
				map.put(command[1],command[2]);
				System.out.println("변경후 map : "+map);
			}
			
			
			
		}
		
		
		
		System.out.println(map);
		System.out.println(arr);
		Set <String> set = map.keySet();
		
		//Iterator<String> it = set.iterator();
		String answer[] = new String[arr.size()];
		for(int i=0; i<arr.size(); i++){
			int index =arr.get(i).indexOf("님");
			String x = arr.get(i).substring(0,index);
			String[] action = arr.get(i).split(" ");
			answer[i] = map.get(x)+"님이 "+action[1];
			//System.out.println(answer[i]);
			
		}
		for(int i=0; i<answer.length; i++)
		System.out.println(answer[i]);
		
		
		return answer;
	}
	
}

