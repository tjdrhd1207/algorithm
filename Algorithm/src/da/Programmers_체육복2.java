package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Programmers_체육복2 {

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
		int[] all = new int[n];

		for (int i : reserve)
			all[i - 1]++;

		for (int i : lost)
			all[i - 1]--;

		for (int i = 0; i < all.length; i++)
			if (all[i] < 0)
				if (i != all.length - 1 && all[i + 1] > 0) {
					all[i]++;
					all[i + 1]--;
				} else if (i != 0 && all[i - 1] > 0) {
					all[i]++;
					all[i - 1]--;
				}

		int answer = 0;

		for (int i = 0; i < all.length; i++) {
			if (!(all[i] < 0)) {
				answer++;
			}
		}
		System.out.println(answer);
		
		return answer;
	}

	
}

 