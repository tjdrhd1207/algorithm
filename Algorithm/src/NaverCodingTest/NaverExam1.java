package NaverCodingTest;

import java.util.Scanner;

public class NaverExam1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//배열 길이
		int n = sc.nextInt();
		//p는 생산량
		int p[]=new int[n];
		//c는 주문량
		int c[]=new int[n];
		for(int i=0; i<n; i++){
			p[i]=sc.nextInt();
			
		}
		
		for(int i=0; i<n; i++){
			c[i]=sc.nextInt();
			
		}
		
		solution(n,p,c);
		
		

	}

	
	
	
	public static String solution(int n, int[] p, int[] c){
		double avg=0;
		String answer="";
		//g는 공급량
		int g=0;
		//price는 단가
		int price=100;
		//sumPrice은 매출액
		int sumPrice =0;
		//stock은 재고 배열
		//int stock[] = new int[n];
		int stock = 0;
		//주문날짜
		int day=0;
		boolean flag=false;
		
		for(int i=0; i<n; i++){
			if(flag ==true){
				break;
			}
			
			if((p[i]+stock)>=c[i]){
				g=c[i];
				sumPrice+=(g*price);
				stock+=p[i]-c[i];
				price=100;
				day++;
				System.out.println("day : "+day);
			}else {
				
				price=price/2;
				day++;
				System.out.println("price : "+price+", day : "+day);
				if(price==12){
					 flag = true;
					 break;
				}
				
				stock+=p[i];
				
			}
			
			
		}
		
		
		//System.out.println(sumPrice+", day : "+day);
		avg=Math.round(sumPrice/day);
		
		System.out.println("완료");
		answer=String.format("%.2f", avg);
		
		System.out.println(answer);
		
		
		
		
		
		
		return answer;
	}
	
}
