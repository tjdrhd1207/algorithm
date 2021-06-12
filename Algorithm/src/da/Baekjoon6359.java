package da;

import java.util.Scanner;

public class Baekjoon6359 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int t[]= new int[x];
		int index[]=new int[x];
		
		for(int i=0; i<x; i++){
			t[i] = sc.nextInt();
			boolean arr[]=new boolean[t[i]+1];
			for(int j=0; j<x; j++) {
				
				
				//System.out.println(arr.length);
				
				for(int k=1; k<t[i]; k++){
					int cnt=k+1;
					int sum=0;
					
					while(sum<=t[i]){
						if(arr[sum]==false) {
						arr[sum]=true;
						System.out.println("arr["+sum+"] : "+arr[sum]);
						sum+=cnt;
						}
						else if(arr[sum]==true){
						arr[sum]=false;
						System.out.println("arr["+sum+"] : "+arr[sum]);
						sum+=cnt;
						}
						
					}
				}
				
				System.out.println("-----------------------");
				
				for(int y=1; y<arr.length; y++){
					//System.out.println("arr["+y+"] : "+arr[y]);
					if(arr[y]==false){
						index[j]++;
					}
				}
				//System.out.println("최종 결과 : "+(index));	
			}
				
		}
		
		for(int i=0; i<x; i++){
			System.out.println(index[i]);
		}
		
		
		
		
		
	}

}
