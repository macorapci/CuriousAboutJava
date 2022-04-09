public class Main034 {
	public static void main(String... args) {
		var child = new Child034();
		System.out.println(child.foo);
	}
}

class Parent034 {
	public int foo;

	Parent034(int foo) {
		this.foo = foo;
	}
}

class Child034 extends Parent034 {
	Child034(int value) {
		super(value + 1);
	}

	Child034() {
		this(20);
	}
}
