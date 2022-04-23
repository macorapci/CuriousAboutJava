public class Main038 {
	public static void main(String... args) {
		var foo = Foo038.BAR;
		foo.setValue(30);

		System.out.println(foo.getValue());
		System.out.println(Foo038.BAR.getValue());
		System.out.println(Foo038.VAR.getValue());
	}
}

enum Foo038 {
	BAR(10), VAR(20);

	private int value;

	private Foo038(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
