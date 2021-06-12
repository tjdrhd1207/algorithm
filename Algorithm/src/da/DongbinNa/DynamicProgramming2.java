package da.DongbinNa;

import java.util.Scanner;

public class DynamicProgramming2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int d[] = new int[n+1];
		
		
		
		for(int i=2; i<n+1; i++){
			d[i] = d[i-1]+1;
			
			if(i%2 ==0){
				d[i] = Math.min(d[i],d[i/2]+1);
			}if(i%3 == 0){
				d[i] = Math.min(d[i],d[i/3]+1);
			}if(i%5 == 0){
				d[i] = Math.min(d[i],d[i/5]+1);
			}
		
		}
		
		System.out.println(d[n]);
	}

}
