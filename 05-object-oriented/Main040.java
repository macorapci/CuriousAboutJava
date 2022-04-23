public class Main040 {
	public static void main(String... args) {
		var foo = new Foo040();
		foo.bar();
	}
}

class Foo040 {
	public void bar() {
		System.out.println("barBAR");
	}

	public int bar(int value) {
		System.out.println("BARbar");
		return 10;
	}

	public int bar(int value, boolean var) {
		System.out.println("barbar");
		return 20;
	}
}
