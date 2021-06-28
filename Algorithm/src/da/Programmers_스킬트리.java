package da;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Programmers_스킬트리 {

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
		while(true){
			
			String skill_tree = skill_trees[index];
			String skill_clone = new String(skill_tree);
			
			int size = skill_tree.length();
			
			for(int i=0; i< size; i++){
				String oneSkill = Character.toString(skill_clone.charAt(i));
				
				if(skill.contains(oneSkill)==false){
					skill_tree = skill_tree.replace(oneSkill, "");
				}
			}
			System.out.println(skill_tree);
			System.out.println(skill.indexOf(skill_tree));
			
			
			index ++;
			if(index== skill_trees.length){
				break;
			}
		}
		
		
		
		
		
		return answer;
	}
	
}
class Skill{
	String skillName;
	int index;
	
	public Skill(String skillName, int index) {
		super();
		this.skillName = skillName;
		this.index = index;
	}

	@Override
	public String toString() {
		return "Skill [skillName=" + skillName + ", index=" + index + "]";
	}

}
