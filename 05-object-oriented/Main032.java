public class Main032 {
	static interface Foo032 { }
	static class Bar032 implements Foo032 { }

	private static void print(Foo032 foo) {
		System.out.println("10");
	}

	private static void print(Bar032 bar) {
		System.out.println("20");
	}

	public static void main(String... args) {
		Foo032 foo = new Bar032();
		Bar032 bar = new Bar032();

		print(foo);
		print(bar);
	}
}


