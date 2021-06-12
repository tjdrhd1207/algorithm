package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GabiaCodingTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		
		long result = factorial(x);
		//System.out.println(result);
		
		String str = Long.toString(result);
		System.out.println("str "+str);
		int answer= 0;
		
		boolean flag = true;
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i=str.length()-1; i>=0; i--){
			if((str.charAt(i)==48)){
				flag = true;
				answer++;
			}
			else {
				flag = false;
			}
			if(flag == false){
				System.out.println(answer);
				array.add(answer);
				answer= 0;
				break;
		
			}
			
		}
		//System.out.println(answer);
		
		int max = Collections.max(array);
		System.out.println(array);
		System.out.println(max);
	}
	
	
	public static long factorial(int n){
		if(n <=1 ){
			return n;
		}else {
			return factorial(n-1)*n;
		}
			
	}
}
