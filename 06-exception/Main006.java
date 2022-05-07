public class Main006 {
	public static void main(String... args) throws Exception {
		System.out.println(foo());
	}

	public static int foo() throws Exception {
		try {
			return 1;
		} finally {
			return 2;
		}
	}
}
