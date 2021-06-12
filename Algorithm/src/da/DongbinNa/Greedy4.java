package da.DongbinNa;

import java.util.Scanner;

public class Greedy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		
		int K = sc.nextInt();
		
		int cnt=0;
		while(true){
			
			
			if(N%K!=0){
				N=N-1;
				cnt++;
			}else {
				N=N/K;
				cnt++;
			}
			
			
			if(N==1){
				break;
			}
			
		}
		
		
	 System.out.println(cnt);
	
	
	}

}
