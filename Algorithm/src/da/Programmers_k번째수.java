package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Programmers_k번째수 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("array길이 입력 : ");
		int len = Integer.parseInt(br.readLine());
		System.out.println("array 배열 원소 입력 ");
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int array[] = new int[len];
		
		int cnt = 0;
		
		while(st.hasMoreTokens()){
			array[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
		System.out.println("commands길이 입력 : ");
		int commandsLen = Integer.parseInt(br.readLine());
		
		int commands[][] = new int[commandsLen][3];
		
		for(int i=0; i<commands.length; i++){
			
			for(int j=0; j<commands[0].length; j++){
				System.out.println("commands원소 입력: ");
				commands[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		solution(array, commands);
	}

	
	
	
	
	
	public static int[] solution(int[] array, int[][] commands){
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		
		
		ArrayList<Integer> resultArray = new ArrayList<Integer>();
		for(int x : array){
			
			arrayList.add(x);
		}
		//System.out.println("arrayList : "+arrayList);
		int cnt = 0;
		
		for(int i=0; i<commands.length; i++){
			
			ArrayList<Integer> newArray = new ArrayList<Integer>();
			
			//start end index값을 변수에 저장
			int start = commands[i][0];
			int end = commands[i][1];
			int index = commands[i][2];
			
			//0을 기준으로 하기 때문에
			start-=1;
			end-=1;
			index-=1;
			//System.out.println("start : "+start+", end : "+end+", index : "+index);
			
			if(start != end) {
				for(int j=start; j<=end; j++){
					newArray.add(array[j]);
				}
			}else {
				newArray.add(array[start]);
			}
			
			Collections.sort(newArray);
			//System.out.println(newArray);
			int result = newArray.get(index);
			resultArray.add(result);
			
		}
		int[] answer = new int[resultArray.size()];
		
		for(int i=0; i<resultArray.size(); i++) {
			answer[i] = resultArray.get(i);
			//System.out.println(answer[i]);
		}
		
		return answer;
	}
	
	
	
	
	
}


