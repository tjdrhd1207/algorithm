package da.DongbinNa;

public class RecursionEndSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		recursion(1);
		
	}
	public static void recursion(int i){
		
		if(i==10) return;
		System.out.println(i+"번쨰 하위입니다.");
		recursion(i+1);
		System.out.println(i+"번째 재귀함수를 종료합니다.");
		
	}
}
