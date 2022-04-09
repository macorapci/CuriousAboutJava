public class Main033 {
	public static void main(String... args) {
		var bar = new Bar033();
        	bar.printValue();
	}
}

interface Foo033 {
	public default void printValue() {
		System.out.println(getValue());
	}

	private static String getValue() {
		return "Value";
	}
}

class Bar033 implements Foo033 {
	public void printValue() {
		System.out.println(getValue() + "Value");
	}
}
