package da;

class Car{
	public Car(){
		System.out.println("Car ������ �ʱ�ȭ");
	}
	public void power(){
		System.out.println("��������");
	}
}

class Truck extends Car{
	public Truck(){
		//super(); ������ �ڵ����� ������!!
		System.out.println("Truck ������ �ʱ�ȭ");
		//super(); �θ��� �����ڰ� ���� �ʱ�ȭ �� �� �ڽ��� �����ڰ� �ʱ�ȭ �Ǿ�� �ϹǷ� ��������
	}
	public void power(){
		//super.power(); �θ�Ŭ������ power�޼ҵ带  �̿��ϱ� ����
		System.out.println("�θ�");
		super.power();  �����ڿ� �޸� ���� ������ ����� �ʿ䰡 �����Ƿ� ������ ���� ����.
	}
}


public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("----Truck Ŭ������ t1��ü�� ����----");
			Truck t1 = new Truck();
			System.out.println("---------------------------");
			//Car c = new Car();
			System.out.println("---------------------------");
			t1.power();
	}

}
