package da.DongbinNa;

public class FactorialSample {
	static int sum=1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(5));
	}
	public static int factorial(int i){
		
		
	
		if(i==0)return 1;
		
		return i*factorial(i-1);
		
		
	}
}
