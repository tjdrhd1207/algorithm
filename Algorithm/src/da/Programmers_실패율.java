package da;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_실패율 {

	public static void main(String[] args) {

		int N = 5;
		//int[] stages = {2,1,2,6,2,4,3,3};
		int[] stages = {2,1,2,4,2,4,3,3};
		
		solution(5,stages);
	}

	public static int[] solution(int N, int[] stages){
		int[] answer = new int[N];
		
		ArrayList<Double> list = new ArrayList<>();
		
		int level = 1;
		int len = stages.length;
		
		while(level<=N){
			int challenger = 0;
			for(int i=0; i<stages.length; i++){
				
				if(level == stages[i]){
					challenger++;
				
				}
				
			}
			System.out.println("도전자 : "+challenger+", 전체길이 : "+len);
			if(challenger==0 ){
			list.add(0.0);
			}else {
			list.add((double)challenger/len);
			}
			len -= challenger;
			level++;
		}
		
		//System.out.println(list);
		double x[] = new double[N];
		
		for(int i=0; i<N; i++){
			x[i] = list.get(i);
		}
		System.out.println(list);
		
		//int index[] = new int[N];
		boolean visit[] = new boolean[N];
		Collections.sort(list);
		Collections.reverse(list);
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++) {
			if(visit[j]==false && list.get(i)==x[j] ){
				//System.out.println("x["+j+"] :"+x[j]+", list.get("+i+") : "+list.get(i));
					visit[j]= true;
					//System.out.println("j값 : "+j+"i값 : "+i);
					answer[i]=j+1;
					break;
				}
			}
		}
		
		
		
		return answer;
	}
}
