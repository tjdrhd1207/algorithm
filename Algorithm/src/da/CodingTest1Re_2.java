package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class CodingTest1Re_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		long start = System.currentTimeMillis();
		
		System.out.println("수를 입력하세요");
		long x =sc.nextLong();
		
		System.out.println(solution(x));
		
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : "+(end-start)/1000.0);
		
		
		
		
	}
	public static long solution(long n){
		HashSet set = new HashSet<Long>();
		ArrayList arrays = new ArrayList<Long>();
		
		long l = n*n;
		
		set.add((long)1);
		
		
		for(int i=2; i<n; i++){
			long x =(long) i*(long)i;
			int cnt=2;
			if(set.contains(x)){
				continue;
			}
				
			while(x<=l){
				set.add(x);
				x=(long)Math.pow(i,cnt);
				cnt++;
			
				
			}
			
		}
		
		arrays.addAll(set);
		Collections.sort(arrays);
		System.out.println(arrays);
		
		long answer = (long) arrays.get((int)n-1);
		
		return answer;
	}
	
	
}
