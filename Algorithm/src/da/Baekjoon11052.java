package da;

import java.util.Scanner;

public class Baekjoon11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//구매하려고 하는 카드의 개수 n
		int n = sc.nextInt();
//		
//		int p[]=new int[n];
//		//p1부터 pn까지 순서별로 가격
//		for(int i=0; i<n; i++){
//			p[i]=sc.nextInt();
//			
//		}
//		
//		int cnt[]= new int[n];
//		for(int i=0; i<n; i++){
//			int x=n;
//			while(true) {
//				
//				if(x%(i+1)!=0){
//					int y=x%(i+1);
//					cnt[i]+=p[y];
//				}
//				
//				x-=(i+1);
//				cnt[i]+=p[i];
//				
//				
//				if(x==0){
//					break;
//				}
//				
//			}
//		}
		   int[] arr = new int[n + 1];
	        int[] d = new int[n + 1];
	 
	        for (int i = 1; i <= n; i++)
	            arr[i] = sc.nextInt();
	 
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                d[i] = Math.max(d[i], d[i - j] + arr[j]);
	            }
	        }
	 
	        System.out.println(d[n]);
		
		
		
	}

}
