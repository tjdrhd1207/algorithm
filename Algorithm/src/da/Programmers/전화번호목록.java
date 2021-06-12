package da.Programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 전화번호목록 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] phone_book = new String[n];
		sc.nextLine();
		
		for(int i=0; i<n; i++){
			phone_book[i] = sc.nextLine();
		}
		
		solution(phone_book);
		

		
		
	}
	
		public static boolean solution(String[] phone_book){
		
			for(int i=0; i<phone_book.length-1; i++){
				for(int j=i+1; j<phone_book.length; j++){
					if(phone_book[j].startsWith(phone_book[i])){
							return false;
					}if(phone_book[i].startsWith(phone_book[j])){
							return false;
					}
				}
			}
			
	
			return true;
		}
		
	
}


