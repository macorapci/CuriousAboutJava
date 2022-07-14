import java.util.*;
import java.util.function.*;

public class Main036 {
	public static void main(String... args) {
		Consumer<Object> consumer1 = System.out::println;
		var consumer2 = System.out::println;

		consumer1.accept("AAA");
		consumer2.accept("BBB");
	}
}
