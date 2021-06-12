package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CodingTestAns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start = System.currentTimeMillis();
		
		long n=15;
		System.out.println("결과 : "+solution(n));
		long end = System.currentTimeMillis();
		System.out.println("실행시간:"+(end-start/1000.0));
		
		
	}
	
	public static long solution(long l){
		//정렬을 위한 리스트
		ArrayList<Long> list = new ArrayList<>();
		//중복제거를 위한 셋
		HashSet<Long>set = new HashSet<>();
		
		//임의의 최대값
		long n2=l*l;
		//1은 거듭제곱해도 증가하지 않으므로 임의로 삽입
		set.add((long)1);
		
	for(int i=2; i<=l; i++) {	
		//이미 다른 수의 거듭제곱에 포함될 경우 다음 진행
		if(set.contains(i)){
			continue;
		}
		long j = (long)i*(long)i;
		while(j<=n2){
			set.add(j);
			j=j*(long)i;
		}
	}
		
		list.addAll(set);
		Collections.sort(list);	
		System.out.println(list);
		long answer = list.get((int)(l-1));
		return answer;
	}

}
