package da.solvedac.bronze;

import java.util.Scanner;

public class Baekjoon1110 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		int sum,a,b,init;
		int cnt=0;
		if(n<10 && n!=0){
	
		cnt++;	
		init=n;	
		
		a=init*10;
		b=init;
		sum=a+b;
		init=sum;
		
		while(true){
		
	
		cnt++;
		a=init/10;
		b=init%10;
		
		
		sum=a+b;
		
		 if(sum<10) {
			init=b*10+sum;
			 }
		 else {
			init=b*10+(sum%10);	 
			 }
			 
			 
		 if(init==n){
			break;
			 }
		
	
		}
		
		
			
		}
		else if(n==0){
			cnt=1;
		}
		
		
		else{
		
		 init=n;
		 
		 
		 while(true) {	
		
		 cnt++;
		 a=init/10;
		 b=init%10;
		
		
		 sum=a+b;
		 
		 if(sum<10) {
		 init=b*10+sum;
		 }
		 else {
		 init=b*10+(sum%10);	 
		 }
		 
		 
		 if(init==n){
			break;
		 	}
		 }
		
			
	 }
		
		System.out.println(cnt);
	
	
	
	}

}
