package da;

import java.util.Scanner;

public class Baekjoon9095 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("x를 입력하세요: ");
		
		//테스트 케이스
		int x=sc.nextInt();
		
		
		
		
		
		 int number[]=new int[11];
		  
		  
		  	number[1]=1;
		  	number[2]=2;
		  	number[3]=4;
		
		for(int i=0; i<x; i++){
		  int y=sc.nextInt();	
	
		  	
		  for(int j=4; j<=y; j++){
			  number[j]=number[j-1]+number[j-2]+number[j-3];
			
		  }
		  
		  System.out.println(number[y]);
		}
	}
		
	}
	

