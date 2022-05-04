public class Main060 {
	public static void main(String... args) {
		new Boo060().print(10);
	}
}

interface Foo060 {
	void print(int value);
}

abstract class Bar060 {
	abstract void print(int value);
}

final class Boo060 extends Bar060 implements Foo060 {
	final public void print(int value) {
		int anotherValue = 5;

		class Coo060 {
			int getValue() {
				return anotherValue + value;
			}
		}

		System.out.println(new Coo060().getValue());
	}
}
