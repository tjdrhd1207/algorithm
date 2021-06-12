package da;

import java.util.Scanner;

public class Baekjoon10821 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		
		int cnt = 1;
		
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			
			if(ch==','){
				cnt++;
			}
			
		}
		System.out.println(cnt);
		
		
	}

}
