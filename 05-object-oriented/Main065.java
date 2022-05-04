public class Main065 {
	public static void main(String... value) {
		var k = new Bar065();
		System.out.println(k.getSuperValue() + ", " + k.getValue());
	}
}

class Foo065 {
	protected final int value = 10;
}

class Bar065 extends Foo065 {
	private int value = 30;

	public int getValue() {
		return this.value;
	}

	public int getSuperValue() {
		return super.value;
	}
}
