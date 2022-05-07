public class Main005 {
	public static void main(String... args) throws Exception {
		foo();
	}

	public static void foo() throws Exception {
		try {
			throw new Exception();
		}
	}
}
