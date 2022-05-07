public class Main001 {
	public static void main(String... args) throws Exception {
		foo();
	}

	public static void foo() {
		try {
			throw Exception();
		} catch (RuntimeException ex) {

		}
	}
}
