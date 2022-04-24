import java.io.FileNotFoundException;

public class Main055 {
	public static void main(String... args) {
		System.out.println(new Bar055().getValue());
	}
}

interface Foo055 {
	String getValue();
}

class Bar055 implements Foo055 {
	public String getValue() throws FileNotFoundException {
		return "20";
	}
}
