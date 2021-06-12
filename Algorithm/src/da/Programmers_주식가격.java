package da;

import java.util.ArrayList;
import java.util.Scanner;

public class Programmers_주식가격 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력:");
		int len = sc.nextInt();
		int prices[]=new int[len];
		
		for(int i=0; i<len; i++){
			prices[i]=sc.nextInt();
		}
		int result[]=new int[len];
		System.out.println(solution(prices,result));
	}

	
	public static ArrayList solution(int[] prices, int[] result){
		
		int cnt=0;
		
		for(int i=0;i<prices.length; i++){
				
			cnt=0;
			
			for(int j=i; j<prices.length;j++){
				if(prices[i]>prices[j]){
					cnt++;
					System.out.println("현재 cnt : "+cnt+"continue");
					break;
				}else {
					System.out.println("현재 cnt : "+cnt);
					cnt++;
					
				}
			}
			
			result[i]=cnt-1;
			System.out.println("--------------------------------");
			System.out.println("result["+i+"]"+result[i]);
		}
		
		ArrayList array = new ArrayList<>();
		
		for(int i=0; i<prices.length; i++){
		array.add(result[i]);
		}
		return array;
	}
}
