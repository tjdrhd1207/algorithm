package da;

abstract class A {
	public abstract void disp();
}

abstract class B extends A{
	
}

class C extends B {
	public void disp(){}
}





public class Example {

	public static void main(String[] args) {
		//A ap = new A();
		//A bp = new B();
		A cp = new C();
		//B dp = new B();
	}

}
