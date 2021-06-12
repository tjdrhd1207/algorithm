package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon3409 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//test케이스 개수
		int n = sc.nextInt();
		
		//방정식 개수
		int k = sc.nextInt();
		
		String str[]= new String[k];
		
		sc.nextLine();
		
		
		for(int i=0; i<k; i++){
			str[i] = sc.nextLine();
			
		String arr[] = str[i].split("=");
		for(int j=0; j<arr.length; j++){
			System.out.println();
			System.out.println(arr[j]);
			}
		
		}
		
		String t = sc.nextLine();
		String p = sc.nextLine();
		
		
		
		
	}

}
