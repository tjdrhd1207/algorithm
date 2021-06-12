package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class NDS_CodingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요");
		String sentence = sc.nextLine();
		
		solution(sentence);
		
		
		
	}	

	
	private static void solution(String sentence) {
		// TODO Auto-generated method stub
		
		HashSet set = new HashSet<Character>();
		ArrayList list = new ArrayList<>();
		ArrayList alpha = new ArrayList<Character>();
		String answer="";
		char x = 'a';
		for(int i=0; i<26; i++){
			
			alpha.add(x);
			x++;
			
		}
		
		sentence =sentence.toLowerCase();
		for(int i=0; i<sentence.length(); i++){
			
			char ch = sentence.charAt(i);
			
			if(!((int)ch >=97 && (int)ch<=122)){
				continue;
			}
			set.add(ch);
		}
		
		list.addAll(set);
		Collections.sort(list);
		System.out.println(set);
		System.out.println(alpha);
		
		for(int i=0; i<alpha.size(); i++) {
			for(int j=0; j<list.size(); j++) {
		if(alpha.contains(list.get(j))){
			alpha.remove(list.get(j));
				}
			}
		}
		
		Collections.sort(alpha);
		System.out.println(alpha);
		for(char i=0; i<alpha.size(); i++){
			answer+=alpha.get(i);
		}
		if(answer== ""){
			answer="perfect";
		}
		System.out.println(answer);
	}
	
	
	
	
}
