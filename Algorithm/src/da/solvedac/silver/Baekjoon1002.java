package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon1002 {

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		while(n-- > 0){
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(point(x1,y1,r1,x2,y2,r2));
			
		}
		
		
		
	}
	
	
	public static int point(int x1,int y1,int r1,int x2,int y2,int r2){
		
		int answer=0;
		
		int distance = (int)(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		
		if(x1==x2 && y1==y2 && r1==r2){
			answer = -1;
			return answer;
		}
		else if(distance >Math.pow(r1+r2,2)){
			answer= 0;
			return answer;
		}
		else if(distance < Math.pow(r2-r1, 2)){
			answer = 0;
			return answer;
		}
		else if(distance == Math.pow(r2-r1, 2)){
			answer=1;
			return answer;
		}
		else if(distance ==  Math.pow(r2+r1,2)){
			answer=1;
			return answer;
		}
		else {
			answer=2;
			return answer;
		}
		
		
		
		
	}
	
	
}
