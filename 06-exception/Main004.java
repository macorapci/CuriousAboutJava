public class Main004 {
	public static void main(String... args) throws Exception {
		foo();
	}

	public static void foo() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println("Finally");
		}
	}
}
