package da.solvedac.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon1476 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		//Scanner sc =new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int E = Integer.parseInt(br.readLine());
		int S = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int Enum=0;
		int Snum=0;
		int Mnum=0;
		
		
		int year=0;
		while(true){
			Enum++;
			Snum++;
			Mnum++;
			
			
			year++;
			
			if(Enum==E && Snum==S && Mnum==M){
				break;
			}
			
			
			if(Enum==15){
				Enum=0;
			}
			if(Snum==28){
				Snum=0;
			}
			if(Mnum==19){
				Mnum=0;
			}
			
			
		}
		
		System.out.println(year);
		
		
		
		
	}

}
