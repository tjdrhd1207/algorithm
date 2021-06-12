package da;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Programmers_완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력: ");
		int n =sc.nextInt();
		String participant[]= new String[n];
		sc.nextLine();
		for(int i=0; i<n; i++){
			participant[i]=sc.nextLine();
		}
		
	
		sc.nextLine();
		String completion[]= new String[n-1];
		for(int i=0; i<n-1; i++){
			completion[i]=sc.nextLine();
		}
		
		System.out.println(solution(participant,completion));
	}
	
	public static String solution(String[] participant, String[] completion){
		String answer="";
		HashSet p = new HashSet<String>();
		HashSet c = new HashSet<String>();
		ArrayList array = new ArrayList<String>();
		ArrayList array2 = new ArrayList<String>();
		String temp="";
		
		for(int i=0; i<participant.length; i++) {
			for(int j=i+1; j<participant.length; j++){
				if(participant[i].equals(participant[j])){
					temp=participant[i];
				}
			}
		}
		System.out.println(temp);
		
		
		for(int i=0; i<participant.length; i++){
			p.add(participant[i]);
		}
		array.addAll(p);
		
		for(int i=0; i<completion.length; i++){
			c.add(completion[i]);
		}
		array2.addAll(c);
		
		int x=0;
		System.out.println(array);
		System.out.println(array2);
			
				int cnt=0;
			for(int i=0; i<array.size(); i++){		 	
				for(int j=0; j<array2.size(); j++){
					if(array.get(i).equals(array2.get(j))){
						array.remove(i);
						
						}
					}
			}
		
		if(!temp.equals("")) {
		array.add(temp);
		
		}
		
		answer=array.toString();
		
		return answer;
	}
}
