package da;

class Car{
	public Car(){
		System.out.println("Car 생성자 초기화");
	}
	public void power(){
		System.out.println("덜덜덜덜");
	}
}

class Truck extends Car{
	public Truck(){
		//super(); 없더라도 자동으로 생성됨!!
		System.out.println("Truck 생성자 초기화");
		//super(); 부모의 생성자가 먼저 초기화 된 후 자식의 생성자가 초기화 되어야 하므로 오류가남
	}
	public void power(){
		//super.power(); 부모클래스의 power메소드를  이용하기 위해
		System.out.println("부릉");
		super.power();  생성자와 달리 생성 순서를 고려할 필요가 없으므로 오류가 나지 않음.
	}
}


public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("----Truck 클래스의 t1객체를 생성----");
			Truck t1 = new Truck();
			System.out.println("---------------------------");
			//Car c = new Car();
			System.out.println("---------------------------");
			t1.power();
	}

}
