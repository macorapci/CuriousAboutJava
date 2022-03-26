public class Main026 {
	public static void main(String... args) {
		System.out.println("I guess it compiled :)");
	}
}

@FunctionalInterface
interface FuncInterface026 {
	public static void method1() {}
	private static void method2() {}
	default void method3() {}
	void method4();
}
