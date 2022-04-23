public class Main044 {
	public static void main(String... args) {
		System.out.println(Foo044.bar(2f));
	}
}

class Foo044 {
	public static int bar(int value) {
		return 10;
	}

	public static int bar(double value) {
		return 20;
	}

	public static int bar(Float value) {
		return 30;
	}
}
