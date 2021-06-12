package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1541 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		String x = sc.nextLine();
	
		char ch;
		int result =0;
		
		int jari = 1;
		ArrayList <Integer> arr = new ArrayList<>();
		
		int n=0;
		 
		String nanum[] = x.split("-");
		
		int sumplus=0;
		
		
		for(int i=0; i<nanum.length; i++){
			
		int sum=0;	
			
		String nanum2[]=nanum[i].split("\\+");
		
		//System.out.println("nanum2["+i+"]"+nanum2[i]);
		  
		for(int j=0; j < nanum2.length; j++){
			 
			  sum +=Integer.parseInt(nanum2[j]);
			
			}
			//System.out.println(sum);
			arr.add(sum);
		}
			
	
		
		
		for(int i=0; i<arr.size(); i++){
		
			if(i==0){
				result += arr.get(i);
				continue;
			}else{
				result += -arr.get(i);
			}
		}
	
		System.out.println(result);
		
	}
}
