public class Main042 {
	public static void main(String... args) {
		int value = 20;

		final class Foo042 extends Bar042 {
			public int getValue() {
				return value;
			}
		}

		System.out.println(new Foo042().getValue());
		value = 10;
	}
}

class Bar042 { }
