public class Main08 {
	public static void main(String... args){
		A08 foo = new A08();
		System.out.println(foo.a);
		System.out.println(foo.b);
	}
}

class A08 {
	public int a;
	public int b;

	public A08() {
		a = 10;
		this = this(20);
	}

	public A08(int b) {
		this.b = b;
	}
}
