package da;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		String S="";
		char[] array = new char[n];
		
		for(int i=0; i<n; i++){
			array[i]=sc.next().charAt(0);
			S+=array[i];
		}
		
		
		System.out.println(S);
		
		System.out.println(solution(S));	
		
		
	}

	public static int solution(String S){
		
		
		int cnt = 0;
		
		int result = 0;
		int len=S.length();
		
		char array[]=S.toCharArray();
		if(S.contains("aaa")){
			result=-1;
		}else {
			
		if(array[0]!='a' &&array[1]!='a'){
			cnt+=4;
		}
			
			
		for(int i=1;i<array.length-1;i++){
			System.out.println(i+"번째 "+array[i]);
			if(array[i]=='a' && array[i+1]=='a'){
			System.out.println("현재 cnt1: "+cnt);
			continue;			
			}else if(array[i]!='a' && array[i+1]!='a'){
			 cnt+=2;
			 System.out.println("현재 cnt2: "+cnt);
			}else {
			 if(array[i-1]!='a') {
			 cnt+=1;
			 }
			 else {
			 continue;
			 }
			 System.out.println("현재 cnt3: "+cnt);
			}
			
			
		}
		if(array[len-1]!='a'){
			cnt+=2;
		}
		
		result=cnt;
		}
		System.out.println("cnt : " +cnt);
		
		return result; 
	}
	
	
}
