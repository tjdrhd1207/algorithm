package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon9012 {


	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수
		int t=sc.nextInt();
		sc.nextLine();
		int sum=0;
		
	
		
		for(int i=0; i<t; i++){
			ArrayList array = new ArrayList<>();
			sum=0;
			//괄호 입력 줄
			
			String str = sc.nextLine();
			
			String result="";
			
			
			
			for(int j=0; j<str.length(); j++){
				array.add(str.charAt(j));
					

				}
			//Collections.sort(array);
			System.out.println(array);
		
			for(int k=0; k<array.size(); k++){
				
				
				if(sum<0){
					result="NO";
					
					break;
				}
				
				
				if(array.get(k).equals('(')){
					sum++;
				}else {
					sum--;
				}
			System.out.println("sum 진행: "+sum+", array["+k+"] : "+array.get(k));
				
			}
			
			if(sum==0){
				result="YES";
				System.out.println(result);
			}else {
				result="NO";
			System.out.println(result);	
			}
			
			
		}
		
		
		
		
		
		
		
	}
	

}


