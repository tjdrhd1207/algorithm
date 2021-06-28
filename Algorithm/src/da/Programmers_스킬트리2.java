package da;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Programmers_스킬트리2 {

	public static void main(String[] args) {

		
		String skill = "CBD";
		String skill_trees[] = {"BACDE", "CBADF", "AECB", "BDA"};
		
		solution(skill, skill_trees);
	}

	public static int solution(String skill, String[] skill_trees){
		int answer = 0;
		
		ArrayList<String> skillList = new ArrayList<>();
		
		HashMap<String, Integer> map = new HashMap<>();
		
			for(int i=0; i<skill.length(); i++) {

				map.put(Character.toString(skill.charAt(i)), i);
			}
			
		System.out.println(map);
		
		int index = 0;

		for(int i=0; i<skill.length(); i++){
			
			
			
			
			
		}
		
		
		
		
		
		return answer;
	}
	
}

