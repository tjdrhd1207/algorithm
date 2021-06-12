package da;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class GabiaCodingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		 
		solution(str);
		
		
	}
	
	public static int solution(String s){
		int answer =0 ;
		
		HashSet<String> set = new HashSet<String>();
		
		int index =0 ;
		int index2 = 0;
		
		
		while(index!=s.length()) {
			for(int i=index; i<s.length(); i++){
				set.add(s.substring(index2,i+1));
				}
			index++;
			index2++;
			}
		System.out.println(set);
		Iterator iter = set.iterator();
		int result = 0;
		while(iter.hasNext()){
			int alphabet[] = new int[26];

			String temp = iter.next().toString();
			for(int i=0; i<temp.length(); i++){
				if(alphabet[(temp.charAt(i)-'0')-49]==0){
					alphabet[(temp.charAt(i)-'0')-49]++;
				}else{
					System.out.println("실패한 string : "+temp);
					result++;
					break;
				}
			}
			System.out.println("이터레이터 : "+((temp.charAt(0)-'0')-49));
				
		}
		
		
		
		System.out.println("결과 : "+(set.size()-result));
		
		return answer;
	}

}
