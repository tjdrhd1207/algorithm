package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon10953 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();		
		
		String str[] = new String[n];
		sc.nextLine();
		
		for(int i=0; i<n; i++){
			str[i]=sc.nextLine();
		}
		
		int sum = 0;
		
		for(int i=0; i<n; i++){
			
			String result[] = str[i].split(",");
			//System.out.println();
			//System.out.println("result.length"+result.length);
			
			for(int j=0; j<result.length; j++){
				sum += Integer.parseInt(result[j]);
			}
			 System.out.println(sum);
			 sum=0;
		}
		
		
		
		
	}

}
