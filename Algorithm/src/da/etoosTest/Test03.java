package da.etoosTest;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int s1[] = new int[n];
		
		int s2[] = new int[n];
		
		for(int i=0; i<n; i++){
			s1[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++){
			s2[i]=sc.nextInt();
		}
		

		solution(s1,s2);
		
	}
	
	    public static int solution(int[] s1, int[] s2) {
	        int answer = -1;
	        
	        
	        for(int i=0;i<s1.length; i++){
	        	for(int j=0; j<s2.length; j++){
	        		
	        		if(s1[i]==s2[j]){
	        			continue;
	        		}
	        		else{
	        			;
	        		}
	        	}
	        }
	        
	        
	        
	        
	        return answer;
	    }
	

}
