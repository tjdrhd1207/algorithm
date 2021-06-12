package NaverCodingTest;

import java.util.Scanner;

public class NaverExam3 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		//성냥개비 사용량
		int k = sc.nextInt();
		
				
		solution(k);
		
		

	}

	public static long solution(int k){
		long answer=0;
		
		int array[] = {6,2,5,5,4,5,6,3,7,6};
		int cnt=0;
		
		for(int i=0; i<array.length; i++){
			if(k%array[i]==0){
				cnt++;
			}
			else if(array[i]==k){
				cnt++;
			}
			for(int j=0;j<array.length;j++){
				if(i==j){
					continue;
				}
				if(k==(array[i]+array[j])){
					cnt++;
				}
				
			}
			
		}
		
		
		System.out.println(cnt);
		
		
		
		
		
		return answer;
	}
	
}
