package da.DongbinNa;

import java.util.Scanner;

public class DynamicProgramming4 {

	public static int[] d = new int[1001];
	
	public static int tile(int n){
		
		d[1] = 1;
		d[2] = 3;
		
		for(int i=3; i<=n; i++){
			d[i]=d[i-2]*2+d[i-1];
		}
		
		return (d[n]%796796);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		System.out.println(tile(n));
		
	}

}
