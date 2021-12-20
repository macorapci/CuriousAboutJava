public class Main7 {
	public static void main(String... args){
		A7 foo = new A7();
		System.out.println(foo.a);
		System.out.println(foo.b);
	}
}

class A7 {
	public int a;
	public int b;

	public A7() {
		this(20);
		a = 10;
	}

	public A7(int b) {
		this.b = b;
	}
}
