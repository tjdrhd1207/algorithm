package da;

import java.util.Scanner;

public class Baekjoon4458 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		
		for(int i=0; i<N; i++){
			
			String s = sc.nextLine();
			String str = "";
			
			for(int j=0; j<s.length(); j++){
				char ch = s.charAt(j);
				
				if(j==0) {
				str += s.toUpperCase().charAt(j);
				}else {
				str += ch;	
				}
			}
			System.out.println(str);
		}
		
	}

}
