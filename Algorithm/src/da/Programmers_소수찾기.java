package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Programmers_소수찾기 {

	static Set<String> list = new HashSet<>();
	static Set<Integer> arrayList = new HashSet<>();
	static boolean visited[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String numbers = br.readLine();
		
		solution(numbers);
		
		
		
	}

	public static int solution(String numbers){
		
		int answer = 0;
		
		int arr[] = new int[numbers.length()];
		visited = new boolean[numbers.length()]; 
		for(int i=0; i<arr.length; i++){
			int  num = numbers.charAt(i)-48;
			
			arr[i] = num;
			visited[i] = false;
			//System.out.println(arr[i]);
		}
		String result = "";
		int cnt = arr.length;
		
		for(int i=cnt; i>=1; i--) {
		nCr(arr, i, result);
		}
		;
		//System.out.println(list.toString());
		
		
		//String x[] = new String[list.size()];
		String[] x = list.toArray(new String[list.size()]);
		int[] sosuArr = new int[x.length];
		for(int i=0; i<x.length; i++){
			//
			arrayList.add(Integer.parseInt(x[i]));
			
		}
		Iterator iter = arrayList.iterator();
		int num = 0;
		while(iter.hasNext()){
			sosuArr[num] = (int) iter.next();
			num++;
		}
		//System.out.println("여기왔나"+arrayList);
		for(int i=0; i<list.size(); i++){
			//Iterator<Integer> iter = list.iterator();
			int sosuCheck = sosuArr[i];
			//System.out.println("sosuCheck : "+sosuCheck);
			double sosuSqrt = Math.sqrt(sosuCheck);
			int sosuSqrtInt = (int) sosuSqrt; 		
			
			int sosuCnt = 0;
			if(sosuCheck!=1) {
			for(int j=1; j<=sosuSqrtInt; j++){
				if((sosuCheck % j) == 0){
					//System.out.println("sosu뭐길래 : "+sosuCheck);
					sosuCnt++;
					//System.out.println("sosuCnt : "+sosuCnt);
				}
			}
			if(sosuCnt==1){
				answer++;
				}
			}
			//sosuCnt = 0;
		}
		System.out.println("answer : " +answer);
		
		
		return answer;
	}
	
		public static void nCr(int[] arr, int len, String result){
			int cnt = len;	
		
				if(cnt == 0 ){
						//System.out.println(result); 
						list.add(result);
						return;
						
				}
				else {
					for(int i=0; i<arr.length; i++){
						if(visited[i] != true) {
							visited[i] = true;
							nCr(arr, cnt-1, result+arr[i]);
							visited[i] = false;
						}
					}
				}
			
			
		}
	
	
}
