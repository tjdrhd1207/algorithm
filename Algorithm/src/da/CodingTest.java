package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodingTest {
	
	    public static void main(String[]args){
	    	
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("정수 입력");
	    	 long n= sc.nextLong();
	    	
	    	 ArrayList<Integer>arrays=new ArrayList<Integer>();
	    	  ArrayList<Integer>arrays2=new ArrayList<Integer>();
	    	 
//	    	  int x=2;
//	    	  for(int i=1;i<=n; i++){
//	    		  x=2;
//	    		 arrays.add((int)Math.pow(i,x));
//	    		  
//	    	  }
//	    	  for(int i=1;i<=n; i++){
//	    		  x=3;
//	    		 arrays.add((int)Math.pow(i,x));
//	    		  
//	    	  } for(int i=1;i<=n; i++){
//	    		  x=4;
//	    		 arrays.add((int)Math.pow(i,x));
//	    		  
//	    	  }for(int i=1;i<=n; i++){
//	    		  x=5;
//	    		 arrays.add((int)Math.pow(i,x));
//	    		  
//	    	  }
	    	  
	    	  
	    	  for(int i=1; i<=50; i++){
	    		  for(int j=2; j<=50; j++){
	    			 arrays.add((int)Math.pow(i, j)); 
	    		  }
	    	  }
	    	 
	    	 for(int i=0; i<arrays.size(); i++){
	    		 if(!arrays2.contains(arrays.get(i))){
	    			 arrays2.add(arrays.get(i));
	    		 }
	    	 }
	    	 
	    	Collections.sort(arrays2);
	    	System.out.println(arrays2);
	    	//answer=arrays2.get(n);
	    	//Collections.sort(arrays2);
	    	//System.out.println(arrays2);
	    	
	    	
	    	System.out.println(arrays2.get((int) n));
	    	
	    	
	    }
	}
