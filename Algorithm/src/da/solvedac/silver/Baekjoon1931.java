package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

//그리디 알고리즘 - 회의실 찾기
public class Baekjoon1931 {

	public static void main(String[] args) throws Exception {

		
		Scanner sc = new Scanner(System.in);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
				
		int[][] time = new int[N][2];
		
		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<2; j++){
				time[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		//끝나는 시간을 기준으로 정렬을 하고  만약 같을 경우에는 시작시간을 기준으로 한다.
		Arrays.sort(time,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]){
					System.out.println("equal o1[0] : "+o1[0]+", o2[0] : "+o2[0]);
					return o1[0]-o2[0];
				}else {
					System.out.println("else o1[1] : "+o1[1]+", o2[1] : "+o2[1]+" return : "+(o1[1]-o2[1]));
					return o1[1]-o2[1];
				}
			}
		});
		
		for(int i=0; i<time.length; i++){
			for(int j=0; j<time[0].length; j++){
				System.out.print(time[i][j]);
			}
			System.out.println();
		}
		
		int end=-1;
		int count=0;
		
		//끝나는 시간을 계속 수정해주며 회의를 진행한다.
		for(int i=0; i<N; i++){
			if(time[i][0]>=end){
				end = time[i][1];
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
	}

}
