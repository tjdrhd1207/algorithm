package da;

import java.util.Scanner;

public class Baekjoon10162 {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = 0;
		int B = 0;
		int C = 0;
		
		int result;
		int temp = N;
		
		while(true){
			if(temp>=300){
				temp=temp-300;
				A++;
			}else if(temp>=60){
				temp=temp-60;
				B++;
			}else if(temp>=10){
				temp=temp-10;
				C++;
			}else {
				if(temp!=0) {
				result = -1;
				}else {
				result = 0;
				}
				break;
			}
		}
		if(result ==0) {
		System.out.println(A+" "+B+" "+C);
		}else {
		System.out.println(result);
		}
		
	}
	
}
