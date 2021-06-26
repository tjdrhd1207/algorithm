package da;

import java.util.ArrayList;

public class Programmers_오픈채팅방 {

	public static void main(String[] args) {

		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		
		solution(record);
		
	}

	public static String[] solution(String[] record){
		String[] answer= {};
		String result = "";
		ArrayList<Domain> list = new ArrayList<>(); 
		
		for(int i=0; i<record.length; i++){
			
			String name[] = record[i].split(" ");
			
			if(name.length==3) {
			Domain dom = new Domain(name[1], name[2], name[0]);
			list.add(dom);
			}
			else {
			Domain dom = new Domain(name[1], "",name[0]);	
			list.add(dom);
			}
			
			
		}
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).action);
			if(list.get(i).action.equals("Enter")) {
				//System.out.println("완전");
				result += list.get(i).id+"님이 들어왔습니다.";
				//System.out.println(result);
			}else if(list.get(i).action.equals("Leave")){
				result += list.get(i).id+"님이 나갔습니다.";	
			}
			
			
		}
	
		System.out.println(result);
		//System.out.println(list);
		
		
		
		
		
		return answer;
	}
	
}

class Domain{
	String id;
	String name;
	String action;
	
	public Domain(String id, String name, String action) {
		super();
		this.id = id;
		this.name = name;
		this.action = action;
	}

	@Override
	public String toString() {
		return "Domain [id=" + id + ", name=" + name + ", action=" + action + "]";
	}
	
	
}
