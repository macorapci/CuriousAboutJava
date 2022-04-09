public class Main030 {
	public static void main(String... args) {
		var foo = new Foo030();
		var value = foo.getBar();
		System.out.println(value);
	}
}


class Foo030 {
	int bar = 20;

	default int getBar() {
		print();
		return bar;
	}

	static void print() {
		System.out.println("Good word");
	}
}
