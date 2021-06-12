package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Baekjoon1181 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		sc.nextLine();
		
		Set<String> SetArray = new HashSet<String>();
		
		for(int i=0; i<N; i++){
		 SetArray.add(sc.nextLine());
		}
		
		
		
		ArrayList<String> array = new ArrayList<String>(SetArray);
		
		System.out.println(array);
		//Comparator 클래스 통해 custom 정렬
		// 길이에 따라서 먼저 정렬하고 길이가 같으면 사전순으로 정렬
		Collections.sort(array, new Comparator<String>(){
				
			public int compare(String v1,String v2){
				System.out.println("처음 v1 과 v2 는 ? "+v1+", "+v2);
				if(v1.length()>v2.length()){
					
					System.out.println("v1 ("+v1+")"+" > v2 ("+v2+") 일때 : ");
					System.out.println(array);
					return 1;
				}else if(v1.length()<v2.length()){
					System.out.println("v1 ("+v1+")"+" < v2 ("+v2+") 일때 : ");
					System.out.println(array);
					return -1;
				}else {
					System.out.println("v1 ("+v1+")"+" == v2 ("+v2+") 일때 : ");
					System.out.println(array);
					System.out.println("결과 : "+v1.compareTo(v2));
					return v1.compareTo(v2);
				}
				
			}
		});
		
		
		System.out.println(array);
		
		System.out.println("---------");
		//System.out.println(SetArray);
		
		for(String str: array){
			System.out.println(str);
		}
		
	}

}
