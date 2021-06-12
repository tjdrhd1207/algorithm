package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class CodingTestRe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		Long n = sc.nextLong();
		
		System.out.println("결과 : "+solution(n));
		
	}
	
	
	
	public static long solution(long l){
		
		ArrayList<Long>arrays = new ArrayList<>();
		
		HashSet<Long>set = new HashSet<>();
		
		//최대값
		long n2=l*l;
		
		set.add((long)1);
		
		for(int i=2; i<l; i++){
			//이미 다른 수의 거듭제곱에 포함될 경우 다음 진행
			if(set.contains(i)){
				continue;
			}
			
			long x = (long)i*(long)i;
			while(x<=n2){
				set.add(x);
				x=x*(long)i;			}			
			
		}
		
		arrays.addAll(set);
		Collections.sort(arrays);
		System.out.println(arrays);
		
		
		long answer = arrays.get((int)l-1);
		return answer;
		
	}

}
