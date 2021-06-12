package da.etoosTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {

	static String wanzu[];
	static int wanzuRecord[][];
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
		
	
	int n = sc.nextInt();
	
	sc.nextLine();
	
	String[] record = new String[n];
	
	for(int i=0; i<n; i++){
		record[i]= sc.nextLine();
	}
	
	
	solution(record);
		
		
	}

	
	 public static String[] solution(String[] record) {
	        String[] answer = {};
	        
	        //int zeroCnt[] = new int[record.length];
	        
	        int cnt=0; 
	        
	        ArrayList<Integer> zeroCnt = new ArrayList<>();
	        
	        for(int i=0; i<record.length; i++){
	        	
	        	 wanzu = record[i].split(":|,");
	        	
	        	for(int j=0; j<wanzu.length; j++){
	        		
	        		System.out.println(wanzu[j]);
	        		
	        		wanzuRecord[i][j]=Integer.parseInt(wanzu[j]);
	        		//System.out.println(wanzuRecord[i][j]);
	        		if(wanzu[j].equals("0")){
	        				cnt ++;
	        			}
	        			
	        		}
	        	zeroCnt.add(cnt);
	        	cnt=0;
	        	}
	        	
	       System.out.println(zeroCnt); 	
	       
	       for(int k=0; k<zeroCnt.size(); k++){
	       if(zeroCnt.get(k)==0){
	    	   
	    	   for(int i=0; i<wanzu.length; i++){
	    		   
	    	    }
	       	  }
	       }
	       
	       
	       //System.out.println("zeroCnt["+i+"]"+zeroCnt[i]);
	        return answer;
	        }
	        
	 
}
