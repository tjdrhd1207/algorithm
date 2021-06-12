package da.DongbinNa;

import java.util.Scanner;

public class FibonacciNumber {

	public static int fibonacci(int x){
		if(x ==1 || x ==2){
			return 1;
		}
		System.out.println(fibonacci(x-1) + fibonacci(x-2));
		return fibonacci(x-1) + fibonacci(x-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//int find = sc.nextInt();
		
		int a1=1;
		int a2=1;
		
		System.out.println(fibonacci(4));
	}

}
