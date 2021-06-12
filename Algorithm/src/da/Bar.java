package da;

class Foo {

public int a=3;

	public void addFive(){

		a+=5;

		System.out.println("f");
		
	}
}

public class Bar extends Foo{
	Foo food = new Foo();
	
	public int a=8;

	public void addFive(){

		this.a += 15;

		System.out.println("b"+", a값 : "+a);

}

public static void main(String[]args){

	Foo  f  = new Bar();

	f.addFive(); // b

	System.out.println(f.a)  ;

	Bar t = (Bar) f;  //강제 형변환

	System.out.println(t.a);

	}

}



