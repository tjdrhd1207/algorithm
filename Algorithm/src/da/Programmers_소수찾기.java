package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Programmers_소수찾기 {

	static ArrayList<String> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String numbers = br.readLine();
		
		solution(numbers);
		
		
		
	}

	public static int solution(String numbers){
		
		int answer = 0;
		
		char arr[] = new char[numbers.length()];
		
		for(int i=0; i<arr.length; i++){
			char  num = numbers.charAt(i);
		
			arr[i] = num;
			//System.out.println(arr[i]);
		}
		String result = "";
		int cnt = arr.length;
		
		for(int i=cnt; i>=1; i--) {
		nCr(arr, i, result);
		}
		
		System.out.println(list.toString());
		
		
		for(int i=0; i<list.size(); i++){
			
			int sosuCheck = Integer.parseInt(list.get(i));
			System.out.println("sosuCheck : "+sosuCheck);
			double sosuSqrt = Math.sqrt(sosuCheck);
			int sosuSqrtInt = (int) sosuSqrt;
			
			int sosuCnt = 0;
			
			for(int j=1; j<=sosuSqrtInt; j++){
				if((sosuCheck % j) == 0){
					System.out.println("sosu뭐길래 : "+sosuCheck);
					sosuCnt++;
					System.out.println("sosuCnt : "+sosuCnt);
				}
			}
			if(sosuCnt==1){
				answer++;
			}
			//sosuCnt = 0;
		}
		System.out.println("answer : " +answer);
		
		
		return answer;
	}
	
		public static void nCr(char[] arr, int len, String result){
			int cnt = len;	
		
				if(cnt == 0 ){
						System.out.println(result);
						list.add(result);
						return;
				}
				else {
					for(int i=0; i<arr.length; i++){
						nCr(arr, cnt-1, result+arr[i]);
					}
				}
			
			
		}
	
	
}
