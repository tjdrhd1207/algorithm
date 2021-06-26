package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Programmers_체육복 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("학생수 입력 : ");
		int n = Integer.parseInt(br.readLine());
		System.out.println("잃어버린 사람 수 입력 : ");
		int lostLen = Integer.parseInt(br.readLine());
		
		int lost[] = new int[lostLen];
		System.out.println("잃어버린 인덱스 나열 : ");
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int cnt = 0;
		
		while(st.hasMoreTokens()){
			lost[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}
		System.out.println("여유분 있는 사람 수 입력 : ");
		int reserveLen = Integer.parseInt(br.readLine());
		
		int reserve[] = new int[reserveLen];
		System.out.println("여유분 인덱스 나열 : ");
		str = br.readLine();
		
		cnt = 0;
		
		st = new StringTokenizer(str, " ");
		
		while(st.hasMoreTokens()){
			reserve[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}
		
		solution(n, lost, reserve);
		
		
		
		
	}
	
	
	public static int solution(int n, int[] lost, int[] reserve){
		int answer = 0;
		int[] student = new int[n+1];
		
		for(int i=0; i<lost.length; i++){
			student[lost[i]]--;
		}
		
		for(int i=0; i<reserve.length; i++){
			student[reserve[i]]++;
		}
		System.out.println("시작");
		for(int i=0; i<student.length; i++){
			System.out.print(student[i]+" ");
		}
		
		System.out.println("끝");
		for (int i = 1; i < student.length; i++) {

			
			if (i != student.length-1) {
				if (student[i + 1] <0 && student[i] == 1) {
					student[i + 1]++;
					student[i]--;
				} else if (student[i - 1] <0 && student[i] == 1) {
					student[i - 1]++;
					student[i]--;
				}
			}
			
		}
		System.out.println("시작2");
		for(int i=0; i<student.length; i++){
			System.out.print(student[i]+" ");
		}
		
		for(int i=1; i<student.length; i++){
			if(student[i]>=0){
				answer++;
			}
		}
		System.out.println();
		System.out.println(answer);
		
		return answer;
	}

	
}

 