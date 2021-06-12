package da;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programmers_전화번호목록 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력:");
		int len = sc.nextInt();
		String phone[]=new String[len];
		
		sc.nextLine();
		
		for(int i=0; i<len; i++){
			phone[i]=sc.nextLine();
		}
		//String result[]=new String[len];
		System.out.println(solution(phone));

		
		
	}
	
	
	
	public static boolean solution(String[] phone){
		
		Set <String> phoneArr = new HashSet<String>();
		
		for(int i=0; i<phone.length; i++){
			phoneArr.add(phone[i]);
		}
		
		ArrayList array = new ArrayList<>();
		array.addAll(phoneArr);
		boolean flag=true;
		
		
		for(int i=0; i<phone.length; i++){
			for(int j=0; j<phone.length; j++){
				if(i==j){
					System.out.println("밖으로");
					break;
				}else{
					if(phone[i].startsWith(phone[j])){
						System.out.println("what? "+phone[i]);
						flag=false;
						break;
					}
				}
			}
		}
		
		
		return flag;
	}
	

}
