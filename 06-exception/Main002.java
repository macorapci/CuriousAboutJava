public class Main002 {
	public static void main(String... args) throws Exception {
		foo();
	}

	public static void foo() {
		try {
			throw new Exception();
		} catch (RuntimeException ex) {

		}
	}
}
