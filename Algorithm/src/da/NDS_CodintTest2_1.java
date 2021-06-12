package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NDS_CodintTest2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		long start =System.currentTimeMillis();
		
		System.out.println("상품크기");
		int n= sc.nextInt();
		System.out.println("박스크기");
		int m=sc.nextInt();
		int goods[]= new int[n];
		
		int boxes[]= new int[m];
		
		for(int i=0; i<n; i++){
			goods[i]=sc.nextInt();
		}
		
		for(int i=0; i<m; i++){
			boxes[i]=sc.nextInt();
		}
		
		solution(goods,boxes);
		long end =System.currentTimeMillis();
		System.out.println(end-start/1000.0);
	}
	
	
	
	private static void solution(int goods[],int boxes[]){
		
		ArrayList array = new ArrayList<Integer>();
		ArrayList array2 = new ArrayList<Integer>();
		
	
		for(int i=0; i<goods.length; i++){
			array.add(goods[i]);
			
		}
		for(int i=0; i<boxes.length; i++){
			array2.add(boxes[i]);
		}
		
		Collections.sort(array);
		Collections.sort(array2);
		
		System.out.println("array : "+ array);
		System.out.println("array2 : "+array2);
		
		int cnt=0;
		for(int i=0; i<array.size(); i++){
			for(int j=i; j<array2.size(); j++){
				if((int)array.get(i)<=(int)array2.get(i)){
					cnt++;
					//array2.remove(i);
					continue;
				}
				
			}
			System.out.println(array+", "+cnt);
		}
		
	}
}
