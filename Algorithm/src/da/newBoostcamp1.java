package da;

import java.util.ArrayList;
import java.util.Collections;

public class newBoostcamp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String param0[] = {"/a/a_v2.x","/b/a.x","/c/t.z","/d/a/t.x","/e/z/t_v1.z","/k/k/k/a_v9.x"};
		solution(param0);
	}

	public static String[] solution(String[] param0){
		
		ArrayList<StringBuffer> list = new ArrayList<>();
		String[] answer = new String[param0.length];
		int x = param0.length;
		/*
		for(int i=0; i<x; i++){
			list.add(param0[i]);
		}*/
		
		for(int i=0; i<x; i++){
			int slashIndex1 = 0;
		
			String result = param0[i];
			for(int j=param0[i].length()-1; j>=0; j--) {
			
				char s = param0[i].charAt(j);
				
				if(s=='/'){
					slashIndex1 = j;
					System.out.println("slashIndex : "+slashIndex1);
					param0[i] = result.substring(slashIndex1+1, param0[i].length());
					break;
				}
				
				
			}
	
		}
		for(int i=0; i<x; i++) {
		int hipeunIndex2 = 0;
		StringBuffer sb = new StringBuffer();
		//System.out.println("result :"+param0[i]);
		boolean flag = false;
		sb.append(param0[i]);
		
		for(int j=0; j<param0[i].length(); j++){

			char s = param0[i].charAt(j);
			if(s=='_'){
				hipeunIndex2 = j;
				flag = true;
				break;
				}
			
			}
		if(flag == true) {
		sb.delete(hipeunIndex2, hipeunIndex2+3);
		}
		System.out.println("sb : "+sb);
		list.add(sb);
		}
		System.out.println(list);
		
		Collections.sort(list);
		int cnt = 0;
		boolean visited[] = new boolean[list.size()];
		StringBuffer xy = null;
		System.out.println(list);
		for(int i=0; i<list.size(); i++){
			
		}
		
		/*for(int i=0; i<list.size(); i++){
			int count = 0;
			for(int j=0; j<list.size(); j++){
				
				if(list.get(i)== list.get(j) && visited[j]==false){
					count++;
					visited[j]=true;
					 xy = list.get(i);
				}
				answer[cnt] = xy.toString();
				cnt++;
				answer[cnt] = Integer.toString(count);
				cnt++;
			}
		}*/
		return answer;
		
	}
}
