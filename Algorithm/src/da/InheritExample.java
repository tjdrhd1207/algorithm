package da;

class SuperClass {
	public SuperClass() { // �θ� ������
		System.out.println("�θ� ������ ȣ��");
	}
}

class SubClass extends SuperClass{
	public SubClass() { // �ڽ� ������
		System.out.println("�ڽ� ������ ȣ��");
	}
}


public class InheritExample {

	public static void main(String[] args) {
		
			SubClass sc = new SubClass(); // �ڽ� �ν��Ͻ� ����
	}

}
