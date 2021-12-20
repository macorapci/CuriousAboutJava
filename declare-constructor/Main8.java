public class Main8 {
	public static void main(String... args){
		A8 foo = new A8();
		System.out.println(foo.a);
		System.out.println(foo.b);
	}
}

class A8 {
	public int a;
	public int b;

	public A8() {
		a = 10;
		this = this(20);
	}

	public A8(int b) {
		this.b = b;
	}
}
