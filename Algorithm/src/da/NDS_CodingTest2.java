package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NDS_CodingTest2 {

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
		int endtime=array.size();
		int time=0;
		int cnt=0;
			while(time<endtime){
			int i=0;
			for(int j=0; j<array2.size(); j++) {
			if((int)array.get(i)<=(int) array2.get(j)){
				System.out.println(array.get(i));
				array.remove(i);
				array2.remove(i);
				cnt++;
				
				}
			}
			if(array.size()==0){
				break;
			}
			System.out.println("현재 array : "+array+", 현재 array2 : "+array2);
			time ++;
		}
		System.out.println("cnt : "+cnt);
		int answer=0;
		answer =cnt;
	}
	
}
