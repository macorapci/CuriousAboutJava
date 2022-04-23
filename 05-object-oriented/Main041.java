public class Main041 {
	public static void main(String... args) {
		System.out.println("Compiled!");
	}
}

interface Foo041 {
	public static int bar() {
		return bar();
	}

	public abstract int anotherBar() {
		return anotherBar();
	}

	public default int defaultBar() {
		return defaultBar();
	}
}
