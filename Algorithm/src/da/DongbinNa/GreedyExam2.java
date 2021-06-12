package da.DongbinNa;

import java.util.Scanner;

public class GreedyExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s =sc.nextLine();
		
		int sum=0;
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			int x = (int) ch-48;
				System.out.println(x);
				if(x!=0 && i==0){
					sum+=x;
				}else if(x!=0 && i!=0 && sum==0){
					sum+=x;
				}
				else if(x!=0 && i!=0){
					sum*=x;
				}else if(x==0){
					sum+=x;
				}
		}
		System.out.println(sum);
	}

}
