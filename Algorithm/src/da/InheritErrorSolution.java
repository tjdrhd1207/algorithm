package da;

class SuperClassEx {
	public SuperClassEx(String str){
		System.out.println(str + "ȣ��");
	}
}

class SubClassEx extends SuperClassEx{
	public SubClassEx() { // �ڽ� ������
		super("�θ� ������ "); // �θ� ������ ȣ��
		System.out.println("�ڽ� ������ ȣ��");
	}
}


public class InheritErrorSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassEx sc = new SubClassEx(); // �ڽ� �ν��Ͻ� ����
	}

}
