package da.solvedac.silver;


import java.util.Scanner;

public class Baekjoon1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int x= sc.nextInt();
		
		int init= 64;
		int sum=0;
		
		int count=0;
		
		while(true){
			if(init>x){
				init=init/2;
				
			}else {
				
				sum+=init;
				count++;
				if(sum>x){
					sum-=init;
					count--;
				}
				init=init/2;
			}
			
			if(sum==x){
				break;
			}
			
			
		}
		
		System.out.println(count);
		
		
	}

}
