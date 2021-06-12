package da;

import java.util.Scanner;

public class Baekjoon {

	 static int[] d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		
		 int n = sc.nextInt();

	      d = new int[n+1];

	      d[0] = 1;
	      d[1] = 2;

	      System.out.println(tiling(n));
	    }
	      static public int tiling(int n){
	          if(d[n] > 0)
	              return d[n];
	          else{
	              d[n] = (tiling(n-1) + tiling(n-2)) % 10007;
	              return d[n];
	          }	
	       }	
		
		
	
	
	}

