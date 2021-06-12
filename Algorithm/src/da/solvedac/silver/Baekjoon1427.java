package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon1427 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

		String N = sc.nextLine();
		
		ArrayList<Character> array = new ArrayList<>();
	
		Character str[]=new Character[N.length()]; 
		for(int i=0; i<N.length(); i++){
			char ch = N.charAt(i);
			array.add(ch);
		}
		
		Collections.sort(array, new Comparator<Character>(){
			@Override
			public int compare(Character ch1, Character ch2){
				if(ch1>ch2){
					return -1;
					
				}
				else if(ch2>ch1){
					return 1;
				}
				else {
					return 0;
				}
			}
		});
		
		
		
	
		
		//System.out.println(array);
		for(char x:array){
			System.out.print(x);
		}
		
	
		
		
	}

}
