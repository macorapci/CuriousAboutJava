public class Main028 {
	public static void main(String... args) {
		print();
	}

	public static void print() throws IllegalArgumentException {
		System.out.println("Printed!");
		throw new RuntimeException();
	}
}
