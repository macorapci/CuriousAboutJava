public class Main048 {
	public static final void main(String... args) {
		System.out.println(new Bar048().getValue());
	}	
}


class Foo048 {
	private final String getValue() {
		return "Foo";
	}
}

class Bar048 extends Foo048 {
	public String getValue() {
		return "Bar";
	}
}
