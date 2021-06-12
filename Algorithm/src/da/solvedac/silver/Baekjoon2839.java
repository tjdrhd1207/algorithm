package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon2839 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//배달해야하는 kg
		int n = sc.nextInt();
		
		int sum=0;
		
		if(n==3){
			sum=1;
		}
		else if(n==4){
			sum=-1;
		}
		else if(n==7){
			sum=-1;
		}
		else if(n%5==0){
			sum=n/5;
		}
		else if(n%5==1){
			
			sum+=n%5;
			sum+=n/5;
			
		}else if(n%5==2){
			sum+=n%5;
			sum+=n/5;
			
		}else if(n%5==3){
			sum+=(n/5)+1;
		}
		else if(n%5==4){
			sum+=(n/5)+2;
		}
		
		
		System.out.println(sum);
	}
	
	

}
