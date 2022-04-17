public class Main038 {
	public static void main(String... args) {
		Foo038 foo = () -> System.out.println("overriden");
		foo.method2();
	}
}

interface Foo038 {
	void method1() {
		method2();
	}

	default void method2() {
		System.out.println("interface method");
	}
}
