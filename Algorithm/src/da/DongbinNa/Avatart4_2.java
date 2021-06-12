package da.DongbinNa;

import java.util.Scanner;

public class Avatart4_2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int hour=24,min=60,sec=60;
		
		
		int cnt=0;
		
		String str="";
		
		for(int i=0; i<=N; i++){
						
			for(int j=0; j<min; j++){
				
				for(int k=0; k<sec; k++){
					
					str=i+""+j+""+k;
					
					if(str.contains("3")){
						
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
