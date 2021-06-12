package da;

class SuperClassEx {
	public SuperClassEx(String str){
		System.out.println(str + "호출");
	}
}

class SubClassEx extends SuperClassEx{
	public SubClassEx() { // 자식 생성자
		super("부모 생성자 "); // 부모 생성자 호출
		System.out.println("자식 생성자 호출");
	}
}


public class InheritErrorSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassEx sc = new SubClassEx(); // 자식 인스턴스 생성
	}

}
