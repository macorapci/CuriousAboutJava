import java.util.function.*;

public class Main011 {
	public static void main(String... args) {
		Supplier<String> supplier = String::new;
		System.out.println("Value: " + supplier.get());
	}
}
