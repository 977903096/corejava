public class TestFinal{
	public static void main(String[] args){
		A a = new A();		
		
		System.out.println(a.i);
		A a2 = new A();
		
		System.out.println(a2.i);
	}
}

class A{
	static final int i = 5;
	/*final int i;
	final B b = new B();*/
	/*public A(){
		i = 5;
	}

	public A(int num){
		i = num;
	}*/
	/*public final void test(){

	}*/
}
class B{
	int i = 5;
}

