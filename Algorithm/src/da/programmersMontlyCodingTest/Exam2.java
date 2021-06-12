package da.programmersMontlyCodingTest;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s=sc.nextLine();
		
		System.out.println(solution(s));
		

	}
	
	public static long	solution(String s){
		
		int result = 0 ;
		int max = 0 ;
		
		/*for(int i=0; i<s.length(); i++){
			for(int j=i; j<s.length(); j++){
				if(s.charAt(i)==s.charAt(j)){
					max=0;
				}
				else {
					//if(j-i>=max){
					
						
						System.out.println("현재 i : "+i+", 현재 j : "+j);
					
						max=j-i;
						
						result+=max;
						
					//}
				}
			}
			
		} */
		
		
		for(int i=0; i<s.length(); i++){
			for(int j=i; j<s.length(); j++){
				for(int k=i; k<=j; k++){
					if(s.charAt(j)==s.charAt(k)){
						
						continue;
					}else {
						
						System.out.println("현재 i : "+i+", 현재 j : "+j+", 현재 k : "+k);
						if(j-k>=max) {
						max=j-k;
						result+=max;
						}else {
						continue;
						}
						System.out.println("현재max : "+max);
					}
				}
				
				
			}
			
			max=0;
		} 	
		
		
		return result;
	}

}
