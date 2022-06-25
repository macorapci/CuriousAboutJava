import java.util.function.*;

public class Main012 {
	public static void main(String... args) {
		Consumer<Integer> consumer = (x) -> x * 3;

		System.out.println(comsumer.accept(10));
	}
}
