package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		int num=666;
		int cnt=1;
		
		while(cnt!=N){
			num++;
			
			if(String.valueOf(num).contains("666")){
				cnt++;
			}
			
		}
		
		
		
		System.out.println(num);
	}
	

}
