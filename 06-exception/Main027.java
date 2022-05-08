public class Main026 {
	public static void main(String... args) {
		System.out.println("What's gonna be output?");

		try {
			new Foo026().print();
		} catch (MyException ex) {
			throw new RuntimeException("B");
		} finally {
			throw new RuntimeException("C");
		}
	}
}

class Foo026 {
	void print() throws RuntimeException {
		throw new RuntimeException("A");
	}
}

class MyException extends Exception {}
