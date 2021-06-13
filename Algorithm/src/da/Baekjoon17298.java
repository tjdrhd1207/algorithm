package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int array[] = new int[x];
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		while(st.hasMoreElements()){
		
			for(int i=0; i<x; i++){
				array[i] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		//index 위치 정보
		int index = 0;
		
		//value값 저장하는 배열
		int value[] = new int[x];
		 
		
		int cnt = 0;
		//프로세스
		while(cnt<x-1){

			//기준점을 다 돌았는데 없는지 확인하는 변수
			boolean flag = false;	
			//기준 index -> i
			
			//기준보다 우측으로 가서하나씩 조회
			
			for(int j=cnt+1; j<x; j++){
				
				if(array[cnt]<array[j]){
					value[cnt] = array[j];
					flag = true;
					break;
					
				}
			}
			if(flag == false){
				value[cnt] = -1;
			}		
			
			cnt++;
		}
		
		

		value[x-1] = -1;
		
		StringBuilder sb = new StringBuilder();
		for(int j =0; j<x; j++) {
			sb.append(value[j]).append(' ');
		}
		System.out.println(sb);
		
		
		
		
	}

}
