public class Main052 {
	public static void main(String... args) {
		new Foo052();
	}
}

class Foo052 extends Bar052 {
	{ System.out.println("4"); }

	public Foo052() {
		super("value");
		System.out.println("5");
	}
}

class Bar052 {
	static { System.out.println("1"); }

	public Bar052(String value) {
		super();
		System.out.println("2");
	}

	{ System.out.println("3");}
}
