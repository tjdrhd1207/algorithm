package da.DongbinNa;

public class FibonacciNumber3 {
	
	public static long[] d = new long[100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d[1] = 1;
		d[2] = 1;
		int n = 50;
		
		for(int i=3; i<=n; i++){
			d[i] = d[i-1]+d[i-2];
		}
		System.out.println(d[n]);
	}

}
