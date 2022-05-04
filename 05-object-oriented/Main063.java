public class Main063 {
	public static void main(String... vargs) {
		System.out.println(new Foo063(10).value);
	}
}

class Foo063 {
	public int value;

	public Foo063(int value) {
		this(null);
	}

	public Foo063(String value) {
		this(20);
	}
}
