package da;

import java.util.Scanner;

public class CodingTest4 {
	
	//숫자 n이 주어졌을때 a+b+c+….+z=n (a,b,c는 자연수) abc…z의 최댓값을 구하는 문제
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long answer = 18;
		int n= sc.nextInt();
		
		int x=1;
		
		while(true) {
			if(n==0){
				x=0;
				break;
			}
			if(n-4==0){
				n=n-4;
				x*=4;
				break;
					}
		if(n-3>=0){
			
			n=n-3;
			x*=3;
			
				}
		
		if(n-2==0){
			n=n-2;
			x*=2;
				}
		
			
		
		
		if(n==1 || n==0){
			break;
			}
		
		}
		
		System.out.println(x);
	}

}
