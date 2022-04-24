public class Main056 {
	public static void main(String... args) {
		System.out.println(new Bar056().getValue());
	}
}

interface Foo056 {
	String getValue();
}

class Bar056 implements Foo056 {
	public String getValue() throws RuntimeException {
		return "20";
	}
}
