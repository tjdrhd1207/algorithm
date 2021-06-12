package da.solvedac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1107 {
	
		static List<Integer> list = new ArrayList<>();
	
		
		public static int chk(int num){
			int length=0;
			
			if(num==0) {
			 return list.contains(num) ? 0 :1 ;
			}
			
			while(num>0){
				if(list.contains(num%10)) return 0;
				
				length++;
				num /= 10;
			}
			
			return length;
		}
		
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		//채널 chanel
		System.out.println("채널 입력");
		int chanel = sc.nextInt();
		
		System.out.println("고장난 버튼 개수");
		//고장난 버튼 개수 m
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("최소값 : ");
		int min = Math.abs(chanel - 100);
		
		
		//int button[]=new int[m];
		
		for(int i=0; i<= 1000000; i++){
			
			
			//버튼 
			
			int length = chk(i);
			System.out.println("length : "+length+", i : "+i);
			
			
			if(length >0) min = Math.min(min,Math.abs(chanel-i)+length);
			
		}
		
		
		
		System.out.println(min);
		
		
		
		
		
		
	}
}
