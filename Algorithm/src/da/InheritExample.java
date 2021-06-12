package da;

class SuperClass {
	public SuperClass() { // 부모 생성자
		System.out.println("부모 생성자 호출");
	}
}

class SubClass extends SuperClass{
	public SubClass() { // 자식 생성자
		System.out.println("자식 생성자 호출");
	}
}


public class InheritExample {

	public static void main(String[] args) {
		
			SubClass sc = new SubClass(); // 자식 인스턴스 생성
	}

}
