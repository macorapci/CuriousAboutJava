public class Main022 {
	public static void main(String... args) throws Exception {
		System.out.println("0");
		try {
			System.out.println("1");
			throw new Exception();
		} catch (Exception ex) {
			System.out.println("2");
			try {
				System.out.println("3");
				throw new Exception();
			} finally {
				System.out.println("4");
			}
		} finally {
			System.out.println("5");
		}
	}
}
