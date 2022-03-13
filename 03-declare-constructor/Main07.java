public class Main07 {
	public static void main(String... args){
		A07 foo = new A07();
		System.out.println(foo.a);
		System.out.println(foo.b);
	}
}

class A07 {
	public int a;
	public int b;

	public A07() {
		this(20);
		a = 10;
	}

	public A07(int b) {
		this.b = b;
	}
}
