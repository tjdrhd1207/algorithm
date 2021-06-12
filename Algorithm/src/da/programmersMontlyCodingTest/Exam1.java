package da.programmersMontlyCodingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
			
		System.out.println(solution(n));
		
	}
	
	public static int solution(int n){
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		int answer=0;
		
		int sum=0;
		int cnt=1;
		int mok=0;
		int result=0;
		while(true){
			
			 if(n<3){
				 mok= n%3;
				 result+=(mok*cnt);
				 break;
			  }	
			
		  sum = n%3;	
		  n = n/3;
		  
		  result+=(sum*cnt);
		  
		  System.out.println(result);
		  cnt*=10;
		  
		
		}
		
		int temp=0;
		while(true){
			temp=result/cnt;
			array.add(temp);
			result=result%cnt;
			cnt=cnt/10;
			
			if(cnt==0){
				break;
			}
		}
		
		System.out.println(array);
		Collections.reverse(array);
		System.out.println(array);
		
		int sibresult=0;
		
		for(int i=0; i<array.size(); i++){
			sibresult+=array.get(i)*Math.pow(3,array.size()-1-i);
		}
		
		
		return sibresult;
	}
}
