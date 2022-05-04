public class Main059 {
	public static void main(String... args) {
		var foo = new Foo059() {
			@Override
			void print() {
				System.out.println("BBBB");
			}
		}
	}
}

interface Foo059 {
	default void print() {
		System.out.println("AAAA");
	}
}
