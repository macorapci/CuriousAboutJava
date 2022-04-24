public class Main058 {
	public static void main(String... args) {
		System.out.println(new Foo058().getValue());
	}
}

class Foo058 {
	private final int finalBar;
	private static int staticBar;

	{ this.finalBar = 20; }
	{ this.staticBar = 30; }

	public int getValue() {
		return this.finalBar/this.staticBar;
	}
}
