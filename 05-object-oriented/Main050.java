public class Main050 {
	public static void main() {
		System.out.println(new Foo050().value);	
	}
}

class Foo050 {
	public final String value;

	public Foo050() {
		this("Bar");
		value = "new bar";
	}

	public Foo050(String value) {
		this.value = value;	
	}
}
